README for lab304.java

Description

This Java program generates a random month and prints its name.

How It Works

Generates a random integer between 1 and 12 using:

int random = (int)(Math.random() * 12 + 1);

Matches the generated number with the corresponding month name.

Displays the month name along with the generated number.

How to Run

Compile the program using:

javac lab304.java

Run the compiled program:

java lab304

Sample Output

August
The Random month I generated is 8

Notes

Make sure to have Java installed.

The Scanner is imported but not used; consider removing it.

Uses multiple if statements for simplicity.
