import csv
import glob

import pandas as pd

csv_path = "selected-classes.csv"
project_folder_path = "PATH_TO_PROJECT_FOLDER"

# Boolean to indicate if we want to find classes with many problematic tests
# or classes with a low rate of problematic tests
many_problematic_tests = True


def read_csv(csv_path):
    # Build a dataframe from the csv file
    data = {'project': [], 'class': [], 'tests': [], 'reverted_tests': [], 'enhancement': []}
    with open(csv_path, 'r') as file:
        reader = csv.reader(file)
        list_of_rows = list(reader)
        for row in list_of_rows[1:]:
            paths = get_paths_for_class(row[0], row[1])
            tests = count_tests(paths)
            reverted = count_reverted_tests(paths)
            enhancement = count_enhancement(paths)
            data['project'].append(row[0])
            data['class'].append(row[1])
            data['tests'].append(tests)
            data['reverted_tests'].append(reverted)
            data['enhancement'].append(enhancement)
            print(row[0], row[1].split(".")[-1], "tests: ", tests, ", reverted tests: ", reverted,
                  ", no comments added: ", enhancement)
    df = pd.DataFrame(data)
    avg_reverted = (df['reverted_tests']).mean()
    std_reverted = (df['reverted_tests']).std()
    avg_enhancement = (df['enhancement']).mean()
    std_enhancement = (df['enhancement']).std()
    high_reverted_threshold = avg_reverted + 2 * std_reverted
    high_enhancement_threshold = avg_enhancement + 2 * std_enhancement
    if many_problematic_tests:
        high_df = df[(df['reverted_tests'] > high_reverted_threshold) & (
                df['enhancement'] > high_enhancement_threshold)].sort_values(by=['reverted_tests', 'enhancement'],
                                                                             ascending=False)
    else:
        high_df = df[(df['reverted_tests'] > avg_reverted) & (df['reverted_tests'] < high_reverted_threshold) & (
                df['enhancement'] > avg_enhancement) & (
                             df['enhancement'] < high_enhancement_threshold)].sort_values(
            by=['reverted_tests', 'enhancement'], ascending=False)

    # Print the dataframe in a csv file
    high_df.to_csv("class-selection.csv", index=False)


def get_paths_for_class(project, class_name):
    dir_path = project_folder_path + project + "/evosuite-tests/" + class_name.replace(
        ".", "/") + "_*"
    return glob.glob(dir_path)


def count_tests(paths):
    count = 0
    for path in paths:
        with open(path) as file:
            for line in file:
                if "@Test" in line:
                    count += 1
    return count


def count_reverted_tests(paths):
    count = 0
    for path in paths:
        with open(path) as file:
            for line in file:
                if "// rollbacked to evosuite" in line:
                    count += 1
    return count


def count_enhancement(paths):
    count = 0
    for path in paths:
        with open(path) as file:
            for line in file:
                if "// No Comments were added" in line:
                    count += 1
    return count


if __name__ == "__main__":
    read_csv(csv_path)
