import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Load the data into pandas DataFrames
test_df = pd.read_csv('hallucination-metrics.csv')
complexity_df = pd.read_csv('complexity.csv')

# For all rows where stage is 'before', multiply the 'enhancement' and 'reverted_tests' columns by -1
test_df.loc[test_df['stage'] == 'Base Prompt', ['enhancement', 'reverted_tests', 'number-of-re-prompts']] *= -1

test_df = test_df.drop('stage', axis=1)

# Join the rows on the 'class' and the 'iteration' columns
aggregation_functions = {'tests': 'max', 'reverted_tests': 'sum', 'enhancement': 'sum', 'number-of-re-prompts': 'sum'}
test_df = test_df.groupby(['class', 'iteration']).aggregate(aggregation_functions)

test_df['reverted_tests_rate'] = test_df['reverted_tests'] / test_df['tests']
test_df['enhancement_rate'] = test_df['enhancement'] / test_df['tests']

# Drop test column
test_df = test_df.drop('tests', axis=1)

merged_df = pd.merge(test_df, complexity_df, left_on='class', right_on='class', how='inner')

# Select relevant columns
selected_columns = ['reverted_tests_rate', 'enhancement_rate', 'number-of-re-prompts', 'loc', 'lcom*', 'wmc']
merged_df = merged_df[selected_columns]

correlation_matrix = merged_df.corr()

# To drop unnecessary columns
correlation_matrix = correlation_matrix.drop(['reverted_tests_rate', 'enhancement_rate', 'number-of-re-prompts'], axis=1)
correlation_matrix = correlation_matrix.drop(['loc', 'lcom*', 'wmc'], axis=0)

# Plot the heatmap
plt.figure(figsize=(10, 8))
sns.heatmap(correlation_matrix, annot=True, cmap='coolwarm', fmt=".2f", vmin=-1, vmax=1)
plt.show()
