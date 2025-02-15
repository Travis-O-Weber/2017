# Text Output Program

A Java program intended to display a simple text message, but requires fixes to run properly.

## Current Issues

The provided code has several structural issues that need to be addressed:
1. Missing class declaration
2. Method is not inside a class
3. Package declaration needs corresponding directory structure

## Corrected Version

Here's how the code should be structured:

```java
package lab101;

public class text {
    public static void main(String[] args) {
        System.out.println("Big nose noises");
    }
}
How to Run (After Fixing)

Create a directory structure matching the package:
lab101/
   └── text.java

Compile the program:
javac lab101/text.java

Run the compiled program:
Copyjava lab101.text


Expected Output
Once fixed, the program will display:
Big nose noises
Technical Details

Programming Language: Java
Package: lab101
Output: Simple text message
No user input required
No external dependencies

Note
This program demonstrates:

Basic Java syntax
Package declaration
Class structure
Print statements

Remember to follow Java naming conventions: class names should start with a capital letter (Text instead of text).
