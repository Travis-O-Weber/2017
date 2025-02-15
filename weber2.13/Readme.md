README for lab13.java

Description

This Java program calculates the value of a savings account after six months with a fixed monthly deposit and a monthly interest rate.

How It Works

Prompts the user to enter the monthly saving amount.

Applies the monthly interest rate (0.417% or 1.00417 multiplier) for six consecutive months.

Displays the final account value after six months.

Formula

Each month: (previous_balance + monthly_saving) * (1 + monthly_interest_rate)

The monthly interest rate used: 0.00417 (corresponding to 5% annual interest compounded monthly)

How to Run

Compile the program using:

javac lab13.java

Run the compiled program:

java lab13

Follow the prompt to enter the monthly saving amount.

Sample Output

Enter the monthly saving amount: 100
After the sixth month, the account value is 608.81

Notes

Make sure to have Java installed.

The Scanner is used for user input; close the scanner if extending the program.

Improved variable naming for clarity.
