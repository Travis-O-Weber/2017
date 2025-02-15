README for lab6.java

Description

This Java program calculates the sum of the digits of a number between 1 and 1000.

How It Works

Prompts the user to enter a number between 1 and 1000.

Extracts each digit using modulus and division operations.

Sums the digits together.

Formula

Units digit: num % 10

Tens digit: (num / 10) % 10

Hundreds digit: num / 100

Total sum: units + tens + hundreds

How to Run

Compile the program using:

javac lab6.java

Run the compiled program:

java lab6

Follow the prompt to enter a number.

Sample Output

please enter a number 1 - 1000: 256
The total is = 13

Notes

Make sure to have Java installed.

The Scanner is used for user input; close the scanner if extending the program.
