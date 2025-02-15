README for lab303.java

Description

This Java program solves a system of two linear equations with two unknowns.

How It Works

Prompts the user to enter the coefficients a, b, c, d, e, and f for the equations:

ax + by = e
cx + dy = f

Calculates the values of x and y using the formulas:

x = (ed - bf) / (ad - bc)
y = (af - ec) / (ad - bc)

Displays the calculated values of x and y.

How to Run

Compile the program using:

javac lab303.java

Run the compiled program:

java lab303

Follow the prompts to enter the coefficients.

Sample Output

Enter a, b, c, d, e, f: 1 2 3 4 5 6
x is -1.0 and y is 2.5

Notes

Make sure to have Java installed.

The Scanner is used for user input; close the scanner if extending the program.

Ensures proper handling when the denominator is zero.

