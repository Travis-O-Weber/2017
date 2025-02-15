# Number to Letter Converter

A Java program that converts numbers 1-26 to their corresponding letters in the English alphabet.

## Description

This program prompts the user to enter a number between 1 and 26, then displays the corresponding letter of the alphabet (A=1, B=2, etc.).

## Files
- `numberandletter.java` - Source code file
- `numberandletter.class` - Compiled bytecode file

## Features

- Takes numeric input (1-26)
- Converts numbers to corresponding alphabet letters
- One-to-one mapping of numbers to letters:
  - 1 → A
  - 2 → B
  - ...
  - 26 → Z

## How to Run

1. Ensure you have Java installed on your system
2. Compile the program:
javac numberandletter.java
3. Run the program:
java numberandletter

## Usage Example
Please type a number 1-26 to have to corresponding letter apper
1
A
Please type a number 1-26 to have to corresponding letter apper
26
Z

## Technical Details

- Programming Language: Java
- Input: Integer via Scanner class
- Output: Single letter to console
- Dependencies: java.util.Scanner

## Implementation Notes

The program currently uses:
- If-else statement chain for number-to-letter conversion
- Scanner for user input
- Basic console output

## Limitations

- No input validation for numbers outside 1-26 range
- No handling for non-integer input
- Uses multiple if-else statements instead of more efficient methods

## Possible Improvements

1. Add input validation
2. Handle invalid inputs gracefully
3. Optimize using more efficient methods like:
   - Arrays
   - Character arithmetic
   - Switch statement
   - ASCII value conversion
4. Add error messages for invalid inputs
5. Add option to convert multiple numbers
6. Add reverse conversion (letter to number)
7. Fix typo in prompt message ("apper" → "appear")
8. Remove unused `numString` variable

## Educational Value

This program demonstrates:
- Basic input/output operations
- Control flow with if-else statements
- Mapping between numbers and letters
- Basic console application structure
