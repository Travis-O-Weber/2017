# Zodiac Sign Calculator

A Java program that determines a person's zodiac sign based on their birth month and day.

## Description

This program prompts users to enter their birth month and day numerically, then determines and displays their zodiac sign based on the astrological date ranges.

## Features

- Takes numeric input for birth month (1-12)
- Takes numeric input for birth day (1-31)
- Covers all twelve zodiac signs:
  - Capricorn (December 22 - January 19)
  - Aquarius (January 20 - February 17)
  - Pisces (February 18 - March 19)
  - Aries (March 20 - April 19)
  - Taurus (April 20 - May 20)
  - Gemini (May 21 - June 20)
  - Cancer (June 21 - July 22)
  - Leo (July 23 - August 22)
  - Virgo (August 23 - September 22)
  - Libra (September 23 - October 22)
  - Scorpio (October 23 - November 21)
  - Sagittarius (November 22 - December 21)
- Includes error checking for invalid dates

## Files
- `astrosign.java` - Source code file
- `astrosign.class` - Compiled bytecode file

## How to Run

1. Ensure you have Java installed on your system
2. Compile the program:
javac astrosign.java
3. Run the program:
java astrosign

## Usage Example
Please type in the numeral month you were born in 3
Please type in the numeral day you were born in 15
Pisces

## Technical Details

- Programming Language: Java
- Input: Console input using Scanner class
- Output: Text output to console
- Dependencies: java.util.Scanner

## Input Requirements

- Month must be a number between 1 and 12
- Day must be a valid day for the given month
- Program will display "Illegal date" for invalid inputs

## Program Structure

The program uses:
- Scanner class for user input
- if-else statements for date range checking
- Logical operators for combining date conditions
- Error handling for invalid dates

## Educational Value

This program demonstrates:
- User input handling in Java
- Complex conditional statements
- Date range validation
- Logical operators
- Console I/O operations
