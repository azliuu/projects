# Terminal Wordle Solver
A terminal based tool to automatically solve wordles, written in C.

![](https://github.com/azliuu/projects/blob/master/wordle_solver_demo.gif)

# Build
* To build the program download the wordle_solver and navigate to the downloaded folder in your terminal.
* Build the executeable: `$ make`

# Usage
* Run the program: `$ ./solver`
* The program will suggest gueses to the user. The first will always be 'irate'.
* Then the user inputs the status of each letter into the terminal after 'irate' is used:
  * y - yellow letter
  * x - grey letter
  * g - green letter
* The solver will then continue to provide guesses based on the given information until the wordle is solved.
