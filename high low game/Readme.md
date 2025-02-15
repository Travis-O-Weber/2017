# High-Low Number Guessing Game

A simple Java console game where players try to guess a randomly generated number.

## Description

This game generates a random number between 0 and 99, and players must try to guess it. After each guess, the program provides feedback indicating if the guess was too high or too low, helping players narrow down the correct number.

## Features

- Random number generation between 0-99
- Interactive console-based gameplay
- Continuous feedback after each guess
- Simple and intuitive interface

## How to Run

1. Make sure you have Java installed on your system
2. Compile the program:
javac highlow.java
Copy3. Run the compiled program:
java highlow
Copy
## Gameplay Instructions

1. The program generates a random number between 0 and 99
2. Enter your guess when prompted
3. The program will tell you if your guess is:
- "Too high" if your guess is above the target number
- "Too low" if your guess is below the target number
- "Correct" when you guess the right number
4. Keep guessing until you find the correct number

## Sample Interaction
Enter your guess: 50
Too high
Enter your guess: 25
Too low
Enter your guess: 37
Correct 37
Copy
## Technical Details

- Programming Language: Java
- Dependencies:
  - java.util.Random (for number generation)
  - java.util.Scanner (for user input)
- Input: Integer values
- Valid input range: 0-99
