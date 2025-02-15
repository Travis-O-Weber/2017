# Zoo Program With Multiple Characters

A Java program demonstrating object-oriented programming concepts through a simulation with different animals and a human character named David.

## Description

This program implements a basic system with different classes (Lion, Monkey, and David) and demonstrates their unique behaviors through sound-making methods.

## Files
- `Zooprogram.java` - Main program file
- `Lion.java` - Lion class implementation
- `Monkey.java` - Monkey class implementation
- `David.java` - David class implementation
- Corresponding `.class` files

## Class Structure

### Lion Class
- Attributes:
  - `private int age`
- Methods:
  - `public void roar()` - Outputs "Roar! Roar!"

### Monkey Class
- Attributes:
  - `private int age`
- Methods:
  - `public void scream()` - Outputs "monkey noises"

### David Class
- Attributes:
  - `private int age`
- Methods:
  - `public void cry()` - Outputs "Big nose noises"

### Zooprogram Class
- Contains the main method
- Creates and manipulates all character objects

## How to Run

1. Ensure you have Java installed on your system
2. Compile all the files:
javac Lion.java Monkey.java David.java Zooprogram.java
3. Run the program:
java Zooprogram

## Current Output
Roar! Roar!
monkey noises
Big nose noises

## Technical Details

- Programming Language: Java
- Object-Oriented Design
- Each class demonstrates:
  - Encapsulation (private attributes)
  - Public methods
  - Basic object behavior

## Features

- Multiple character types
- Different sound behaviors for each character
- Sequential execution of behaviors
- Basic object-oriented structure

## Possible Improvements

1. Create a common interface for sound-making
2. Add more attributes to characters (name, age usage, etc.)
3. Add more behaviors (eat, sleep, move, etc.)
4. Implement constructors with parameters
5. Add getter/setter methods for age
6. Add interaction between characters
7. Create a proper management system
8. Add user input for character creation
9. Implement error handling
10. Add documentation comments

## Educational Value

This program demonstrates:
- Basic OOP concepts
- Multiple class management
- Method implementation
- Object instantiation
- Sequential program execution
- File organization in Java
