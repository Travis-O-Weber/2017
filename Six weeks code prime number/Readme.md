# Prime Number Checker

A Java program that determines whether a user-input number is prime or not.

## Description

This program prompts the user to enter a number and then determines if it's a prime number. A prime number is a natural number greater than 1 that is only divisible by 1 and itself.

## Features

- Takes numeric input from user
- Checks if the number is prime using an efficient algorithm
- Only checks divisibility up to half of the input number
- Provides clear output indicating whether the number is prime or not

## Files
- `primenumberchecker.java` - Source code file
- `primenumberchecker.class` - Compiled bytecode file

## How to Run

1. Ensure you have Java installed on your system
2. Compile the program:
javac primenumberchecker.java
3. Run the program:
java primenumberchecker

## Usage Example
Please enter a number for check:
17
17 is a Prime Number
Please enter a number for check:
24
24 is not a Prime Number

## Technical Details

- Programming Language: Java
- Input: Integer via Scanner class
- Output: Text result to console
- Algorithm: Checks divisibility up to n/2
- Dependencies: java.util.Scanner

## Implementation Notes

The program uses:
- Boolean flag to track prime status
- For loop for divisibility checking
- Early termination when a divisor is found
- Modulo operator for divisibility testing

## Algorithm Explanation

1. Takes a number input from user
2. Checks divisibility from 2 to number/2
3. If any number divides evenly (remainder = 0):
   - Marks as not prime
   - Exits the loop early
4. If no divisors are found, the number is prime

## Limitations

- Only works with positive integers
- No input validation for negative numbers or non-integers
- May not be optimized for very large numbers

## Possible Improvements

1. Add input validation
2. Optimize algorithm to check up to square root of n
3. Handle special cases (0, 1, negative numbers)
4. Add option to check multiple numbers
5. Add better error handling
