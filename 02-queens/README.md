A variation of the n queens problem.
Instead of finding a solution, it will find and count all solutions based on the given dimensions.

Running: Compile and run Driver.  Give the size of the board to the scanner.

Drawbacks: Since we consider all possible boards, there are sum limitations
•The scanner only accepts dimensions less than 15 for the sake of run time.
•It will only print out the first 500 solutions (affects boards of 10 or greater) to prevent the terminal from getting flooded.  HOWEVER, it will still give a tally.
•I was unable to use any animation in the code reasonably since it has to run as fast as possible, but it still prints the completed boards.