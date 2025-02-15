README for lab17.java

Description

This Java program calculates the wind chill index based on user-provided temperature and wind speed.

How It Works

Prompts the user to enter the temperature in Fahrenheit (between -58°F and 41°F).

Prompts the user to enter the wind speed (>= 2 mph).

Calculates the wind chill index using the formula:

wind_chill = 35.74 + 0.6215 * temp - 35.75 * (vel^0.16) + 0.4275 * temp * (vel^0.16)

Displays the calculated wind chill index.

How to Run

Compile the program using:

javac lab17.java

Run the compiled program:

java lab17

Follow the prompts to enter the temperature and wind speed.

Sample Output

Enter the temperature in Fahrenheit between -58 degrees F and 41 degrees F: 30
Enter the wind speed (>=2) in miles per hour: 5
The wind chill index is 25.37

Notes

Make sure to have Java installed.

The Scanner is used for user input; close the scanner if extending the program.

Ensured correct input ranges for valid results.
