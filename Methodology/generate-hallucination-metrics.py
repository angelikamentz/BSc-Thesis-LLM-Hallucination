import csv
import glob

import numpy as np
import pandas as pd

server_logs_path = "PATH_TO_SERVER_LOGS_FOLDER"
test_files_path = "PATH_TO_GENERATED_TEST_FILES_FOLDER"

# Boolean to indicate if we are measuring for Source Code or Error Code prompt
source_code_prompt = True

after_stage = "Source Code Prompt" if source_code_prompt else "Error Code Prompt"

def generate_metrics_csv():
    # For every file in server-logs, count_re_prompts
    data = {'class': [], 'stage': [], 'iteration': [], 'tests': [], 'reverted_tests': [], 'enhancement': [],
            'number-of-re-prompts': []}

    server_logs_paths = glob.glob(server_logs_path + "/*")
    number_of_re_prompts = {}
    for log in server_logs_paths:
        number_of_re_prompts[log.split("/")[-1].split('-server')[0]] = count_re_prompts(log)

    test_files_paths = glob.glob(test_files_path + "/*")
    tests = {}
    for test_file in test_files_paths:
        tests[test_file] = count_tests([test_file])

    reverted_tests = {}
    for test_file in test_files_paths:
        reverted_tests[test_file] = count_reverted_tests([test_file])

    enhancement = {}
    for test_file in test_files_paths:
        enhancement[test_file] = count_enhancement([test_file])

    for test_file in test_files_paths:
        file_name = test_file.split("/")[-1].split(".")[0]
        class_no = file_name.split("-")[0]
        data['class'].append("MethodWriter" if class_no == "1" else ("Robot" if class_no == "2" else "ClassReader"))
        data['stage'].append(file_name.split("-")[1])
        data['iteration'].append(file_name.split("-")[2])
        data['tests'].append(tests[test_file])
        data['reverted_tests'].append(reverted_tests[test_file])
        data['enhancement'].append(enhancement[test_file])

        data['number-of-re-prompts'].append(number_of_re_prompts[file_name])

    data['stage'] = ['Base Prompt' if stage == 'before' else after_stage for stage in data['stage']]
    data['tests'] = [int(test) for test in data['tests']]

    print(np.sum(data['tests']))
    print(np.sum(data['reverted_tests']))
    print(np.sum(data['enhancement']))

    df = pd.DataFrame(data).sort_values(by=['class', 'iteration', 'stage'])

    df.to_csv("hallucination-metrics.csv", index=False)


def count_re_prompts(path):
    count = 0
    with open(path) as file:
        for line in file:
            if "Trying again with same prompt..." in line:
                count += 1
    return count


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


generate_metrics_csv()
