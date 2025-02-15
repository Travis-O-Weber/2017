README for lab305.java

Description

This Java program determines the current day and the future day based on the number of days elapsed.

How It Works

Prompts the user to enter the current day as an integer (0 for Sunday, 1 for Monday, etc.).

Prompts the user to enter the number of days elapsed since the current day.

Calculates the future day using the formula:

future_day = (current_day + elapsed_days) % 7

Displays the current day and the calculated future day.

How to Run

Compile the program using:

javac lab305.java

Run the compiled program:

java lab305

Follow the prompts to enter the current day and elapsed days.

Sample Output

Enter today's day (0 - 6): 3
Enter the number of days elapsed since today: 4
Today is Wednesday and the future day is Sunday

Notes

Make sure to have Java installed.

The Scanner is used for user input; close the scanner if extending the program.

Uses multiple if statements for day name determination; consider using a switch statement for cleaner code.
