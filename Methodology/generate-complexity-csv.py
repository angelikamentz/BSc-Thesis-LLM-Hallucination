import glob

folder = glob.glob('class-complexity/*')

# Concatenate all the files in the folder
with open('complexity.csv', 'w') as file:
    for sub_folder in folder:
        sub_folder_files = glob.glob(sub_folder + '/*')
        for path in sub_folder_files:
            if 'class.csv' in path:
                with open(path) as f:
                    # Read CSV without the first column
                    for line in f:
                        file.write(line.split(',')[0].split('/')[-1].split('.java')[0] + "," + line.split(',')[1].split('.')[-1] + "," + ",".join(line.split(',')[2:]))
                    file.write('\n')

