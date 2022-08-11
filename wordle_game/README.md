# Terminal Wordle Game

A terminal wordle game based on NYT's Wordle, written in C.

<img src="https://github.com/azliuu/projects/blob/master/wordle_game_demo.gif" width = "640" height = "388"/>

## Build

* Download the wordle_game folder, and navigate to it in the terminal.
* Run `make` to build the executeable.
* After you're finished, `make clean` removes the executeable.

## Playing the Game

* After building the program, to play Wordle with a random secret run: `./wordle`
* Each letter in a guess can be:
  * y = letter is in the word, but not in the right place.
  * x = letter is not in the word.
  * g = letter is in the word and in the correct place.
* The program will output the state of each letter in every guess.
* If you guess the right word, you win!

## Notes

* In order to accurately abide by Wordle rules, the `vocabulary.txt`file should be altered as Wordle changes/updates the official accepted word list.
