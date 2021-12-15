## Group members
&nbsp;

| NMec | Name | email | Contribution (%) | Detailed contribution [1]
|:-:|:--|:--|:-:|:--|
| 98491 | Pedro Sobral | sobral@ua.pt | 23% | primary-grammar (25%)<br>examples (20%)<br>testing (25%) <br>secondary-semantic-analysis (50%) <br>secondary-interpretation (40%) <br> primary-semantic-analysis(15%) <br> code-generation (20%) <br>secondary-grammar(20%)|
| 98498  | Daniel Figueiredo  | dani.fig@ua.pt  | 23%  | primary-grammar (25%)<br>examples (20%)<br>testing (25 %) <br>secondary-semantic-analysis (50%) <br>secondary-interpretation (40%) <br> primary-semantic-analysis(70%) <br> code-generation (10%) <br>secondary-grammar(20%)|
| 98513  | Eva Bartolomeu | evabartolomeu@ua.pt  | 23%  | primary-grammar (25%) <br>code-generation (50%) <br>secondary-grammar (20%) <br>secondary-interpretation/secondary-code-generation (20%)<br> examples (20%)<br> testing (25%)  |
| 98512  | Eduardo Fernandes  | eduardofernandes@ua.pt  | 23%  |  primary-grammar (25%) <br> examples (20%) <br> testing (25%) <br> secondary-interpretation (30%) <br> primary-semantic(15%) <br>code-generation (30%) <br> secondary-grammar(20%) |
| 95080  | Alírio Rego | aliriorego@ua.pt  | 8%  | secondary-grammar(20%) <br> examples (20%)|

[1] Topics:<br>
   primary-grammar (%)<br>primary-semantic-analysis (%)<br>code-generation (%)<br>secondary-grammar (%)<br>secondary-semantic-analysis (%)<br>secondary-interpretation/secondary-code-generation (%)<br>examples (%)<br>testing (%)<br>other (%) (explain)

## Material to be evaluated

- Beware that **only** the code in the **master** branch will be considered for evaluation.

## Compilation & Run

- We create a *bash* script, **[execute.sh](/execute.sh)** to *compile* and *run* our language. This script compile the code using the command *antlr4-build*, then run the *[main](/src/PrimaryGrammar/PrimaryGrammarMain.java)* of our first grammar, and then compile the [java file](../src/Output.java) provinient of code generation and run it
- On the first try you have to give permissions to the *bash* script:
```
chmod u+x execute.sh
```
- To run, you have to pass a filename with the extention .qz as argument, this script have to be run on root directory:
```
./execute.sh <filename>
```

## Working examples

Use examples to show the language functionalities.

1. [declarationInitialization.qz](./../examples/declarationInitialization.qz) -> examples/declarationInitialization.qz

    This example is to show examples of declarate and initializate variables, it can be do by 2 ways:
    - First declarate a variable and then (other line) initializate.
    - Declarate and initializate the variable on the same line.

    To run:
    ```
    ./execute.sh declarationInitialization.qz
    ```

2. [createQuiz.qz](./../examples/createQuiz.qz.qz) -> examples/createQuiz.qz

    This example is to show a example of a quiz. First of all we gave a title to the quiz, then we create some questions.
    We made the command *capture request <id_pergunta>*, and then we create a report, (on src/ folder) to show the result of the quiz.

    To run:
    ```
    ./execute.sh createQuiz.qz
    ```

3. [shuffleAnswer.qz](./../examples/shuffleAnswer.qz) -> examples/shuffleAnswer.qz

    This example is to show a example of the shuffle answers working. It prints on terminal, the answer before being shuffled, and then. NOTE: The shuffle is random, so there is a little probability that answers order after the shuffle remains the same, it that case, re-run the program.

    To run:
    ```
    ./execute.sh shuffleAnswer.qz
    ```
4. [quizWithShuffleAnswers.qz](./../examples/quizWithShuffleAnswers.qz) -> examples/quizWithShuffleAnswers.qz

    This example is to show a example of the shuffle answers working. It prints on terminal, the answer before being shuffled, and then. The answer is the same, (only the iD is different to show on report that with answers shuffled the correction system works) NOTE: The shuffle is random, so there is a little probability that answers order after the shuffle remains the same, it that case, re-run the program. The report is create on [src](../src/) folder.

    To run:
    ```
    ./execute.sh quizWithSuffleAnswers.qz
    ```

5. [editQuestion.qz](./../examples/editQuestion.qz) -> examples/editQuestion.qz

    This example is to show a example of the edit questions feature. This feature allows the programmer to choose a set of answer of the total os possibility answer.
    Example: a question have 4 multiple-choice answers, and somebody wants that the question only have two determinate answer.

    To run:
    ```
    ./execute.sh editAQuestion.qz
    ```
6. [getQuestionFromDataBase.qz](./../examples/getQuestionFromDataBase.qz) -> examples/getQuestionFromDataBase.qz

    This example is to show a example of retired question from the database.
    NOTE: For reasions of time, the method of making a quiz with the question from data base, well as get questions from data base with filter, like theme and id, don't work properly, the semantic check of this main methods is done, this methods on compiler isn't implemented.

    To run:
    ```
    ./execute.sh getQuestionFromDataBase.qz
    ```

## Semantic error examples

1. [error1.qz](./../examples/error1.qz) -> examples/error1.qz

    When command below is executed the main semantic error are reported on terminal. 

  To run:
    ```
    ./execute.sh error1.qz
    ```
