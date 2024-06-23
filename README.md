# Replication Package: Reducing LLM Hallucinations with Retrieval Prompt Engineering

This is the replication package for the research project "Reducing LLM Hallucinations with Retrieval Prompt Engineering". This guide will walk you through setting up the tools involved in our study, including a Large Language Model (LLM) server and the UTGen, and utilizing the scripts available to replicate our experiments.

## Setting up

For the setup of the tools you may follow the instructions on [UTGen's replication package](https://github.com/UTGen/UTGen/).

## File Structure

The repository's contents are distributed over 4 main folders:

1. **Experiment:** Contains the files necessary for the experiment setup. `select-experiment-classes.py` is the script run on `selected-classes.csv` to select what classes the experiment will be run on.
2. **Implementation:** Stores the source code of our implementation. That includes the LLM-server and the two UTGen versions, which incorporate compilation errors and source code to the prompt respectively.
3. **Methodology:** Here we keep all files related to conducting our experiments. The 'class-complexity' folder contains the results of [ck](https://github.com/mauricioaniche/ck) on our selected classes. The available scripts can be used to calculate our metrics of interest and generate their respective graphs.
4. **Results:** Contains the results of our experiments. For each research question, we maintain a folder 'utgen-output' which stores the entire generated outputs of UTGen over our iterations. 'generated-test-files' and 'server-logs' contain parts of the output, named as necessary to be processed by the scripts: `<class index>`-`<before or after our approach>`-`<iteration>`

```
.
├── Experiment
│   ├── select-experiment-classes.py
│   ├── selected-benchmarks
│   └── selected-classes.csv
|
├── Implementation
│   ├── LLM-server
│   └── UTGen
│       ├── compilation-error-UTGen
│       └── source-code-UTGen
|
├── LICENSE
|
├── Methodology
│   ├── class-complexity
│   │   ├── class-reader
│   │   ├── method-writer
│   │   └── robot
│   ├── generate-complexity-correlation-matrix.py
│   ├── generate-complexity-csv.py
│   ├── generate-hallucination-metrics-graph.py
│   └── generate-hallucination-metrics.py
|
├── README.md
|
└── Results
    ├── RQ1-source-code-results
    │   ├── generated-test-files
    │   ├── server-logs
    │   └── utgen-output
    └── RQ2-compilation-errors-results
        ├── generated-test-files
        ├── server-logs
        └── utgen-output
```

## Contributing

If you would like to contribute to the project, follow the guidelines below:

1. Fork the repository and create your own branch.
   bash
   git checkout -b feature/your-feature-name

2. Implement your changes and ensure they follow the project's coding conventions.

3. Test your changes thoroughly.

4. Commit your changes and push them to your forked repository.

```bash
git commit -m "Add your commit message"
git push origin feature/your-feature-name
```

5. Open a pull request in the main repository, describing your changes and their purpose.

