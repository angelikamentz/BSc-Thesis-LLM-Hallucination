import pandas as pd
import matplotlib.pyplot as plt

# Load the data into a pandas DataFrame
df = pd.read_csv("hallucination-metrics.csv")

# Boolean to indicate if we are measuring for Source Code or Error Code prompt
source_code_prompt = True

after_stage = "Source Code Prompt" if source_code_prompt else "Error Code Prompt"

# Calculate reverted tests rate and enhancement rate
df['reverted_tests_rate'] = df['reverted_tests'] / df['tests']
df['enhancement_rate'] = df['enhancement'] / df['tests']

# Group the data by class and stage
graph_data = df.groupby(['class', 'stage']).mean().reset_index()

# Pivot the DataFrame to get 'before' and 'after' side-by-side
metrics = ['number-of-re-prompts', 'reverted_tests_rate', 'enhancement_rate']
df_pivot = graph_data.pivot(index='class', columns='stage', values=metrics)
df_pivot = df_pivot.reset_index()
print(df_pivot)

# Plotting the data
fig, axes = plt.subplots(3, 1, figsize=(7, 12), sharey=False)

titles = ['Number of Re-prompts', 'Reverted Tests Rate', 'Enhancement Stagnation Rate']

# Flatten axes array for easy iteration
axes = axes.flatten()

for i, (ax, metric, title) in enumerate(zip(axes, metrics, titles)):
    df_pivot.plot(kind='bar', x='class', y=[(metric, 'Base Prompt'), (metric, after_stage)], ax=ax, color=['orange', 'blue'])
    ax.set_title(title)
    ax.set_ylabel('Average Rate' if 'rate' in metric else 'Average Count')
    ax.legend(['Base Prompt', after_stage])
    ax.set_xlabel('Class')

plt.tight_layout(rect=[0, 0, 1, 0.96])
plt.show()
