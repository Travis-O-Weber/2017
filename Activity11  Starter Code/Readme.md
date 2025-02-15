Java Card Deck Project

Overview

This project simulates a deck of playing cards and implements two solitaire-style games, Elevens and Thirteens, using Java classes. It demonstrates object-oriented principles such as encapsulation, inheritance, and polymorphism.

Card.java: Represents an individual card with rank, suit, and point value.

Deck.java: Represents a deck of cards that can be shuffled and dealt.

DeckTester.java: Tests the functionality of the Deck class.

Elevens.jar: A compiled Java archive (JAR) file, related to the Elevens card game activity.

ElevensBoard.java: The core game logic for the Elevens card game.

Board.java: An abstract base class for the game board.

CardGameGUI.java: A graphical user interface for interacting with the Elevens game.

ElevensGUIRunner.java: The main class to run the GUI version of the Elevens game.

ElevensSimulation.java: A non-interactive simulation of the Elevens game.

ThirteensBoard.java: The core game logic for the Thirteens card game.

ThirteensGUIRunner.java: The main class to run the GUI version of the Thirteens game.

ThirteensSimulation.java: A non-interactive simulation of the Thirteens game.

File Descriptions

1. Card.java

The Card class models a playing card with the following properties:

rank: The rank of the card (e.g., Ace, King, Queen, etc.).

suit: The suit of the card (e.g., Hearts, Diamonds, Clubs, Spades).

pointValue: The point value associated with the card.

Key Methods:

Card(String rank, String suit, int pointValue): Constructor to initialize a card.

String suit(): Returns the card's suit.

String rank(): Returns the card's rank.

int pointValue(): Returns the card's point value.

boolean matches(Card otherCard): Compares two cards for equality.

String toString(): Provides a readable description of the card.

2. Deck.java

The Deck class models a deck of cards.

Key Attributes:

cards: A list of Card objects representing the deck.

size: Tracks the number of undealt cards.

Key Methods:

Deck(String[] ranks, String[] suits, int[] values): Initializes the deck with given ranks, suits, and values.

boolean isEmpty(): Checks if the deck is empty.

int size(): Returns the number of undealt cards.

Card deal(): Deals a card from the deck.

void shuffle(): Randomly shuffles the deck.

String toString(): Provides a formatted representation of the deck.

Note: The shuffle method has been implemented using a modern algorithm.

3. DeckTester.java

The DeckTester class tests the deck functionality.

Key Steps:

Initializes a Deck with sample ranks, suits, and values.

Prints the deck's contents and key information before and after dealing cards.

Uses assert statements to validate the deck's behavior under various scenarios.

Deals all cards to test isEmpty() and deal() methods.

Attempts to deal from an empty deck to confirm proper handling.

4. Elevens.jar

The Elevens.jar file is a compiled Java archive related to the Elevens card game activity. It may include:

Prebuilt logic for the Elevens game.

Additional card classes and utilities.

A runnable interface to test the Deck class in the context of the Elevens game.

To run the JAR file:

java -jar Elevens.jar

Ensure you have Java installed and available in your system's PATH.

5. ElevensBoard.java

The ElevensBoard.java file implements the game logic for the Elevens card game.

Key Components:

Board Size: 9 cards.

Ranks, Suits, and Point Values: Used to initialize the deck.

Game Logic: Methods to identify legal plays, replace cards, and check for game completion.

Objective: Remove pairs that sum to 11 or sets of J, Q, K.

Gameplay Summary:

The goal of Elevens is to remove pairs of cards that sum to 11 or sets of Jack, Queen, and King.

6. Board.java

The Board.java file provides a generic, abstract representation of a game board. It serves as the base class for ElevensBoard and ThirteensBoard.

Key Features:

Manages an array of Card objects and a Deck.

Provides methods for dealing cards, checking the board state, and displaying the board.

Declares abstract methods isLegal and anotherPlayIsPossible, implemented by subclasses.

Role in the Game:

This class simplifies the code for game variants like Elevens and Thirteens by providing shared functionality.

7. CardGameGUI.java

The CardGameGUI.java file provides a graphical user interface for the card games.

Key Features:

Displays cards and status messages.

Allows players to select cards, replace them, and restart the game.

Utilizes Java's Swing library for GUI components.

User Interaction:

Clickable cards to select them.

Buttons to replace selected cards or restart the game.

Status messages to track remaining cards and game outcomes.

8. ElevensGUIRunner.java

The ElevensGUIRunner.java file serves as the entry point to launch the Elevens game with the GUI.

Key Steps:

Initializes an ElevensBoard.

Creates a CardGameGUI instance.

Calls displayGame() to launch the interactive interface.

Execution:

javac *.java
java ElevensGUIRunner

9. ElevensSimulation.java

The ElevensSimulation.java file simulates non-interactive Elevens games to test the logic and game outcomes.

Key Features:

Simulates multiple games without user input.

Displays win rates and game statistics.

Useful for debugging and performance evaluation.

Execution:

javac *.java
java ElevensSimulation

10. ThirteensBoard.java

The ThirteensBoard.java file implements the game logic for the Thirteens card game.

Key Components:

Board Size: 10 cards.

Ranks, Suits, and Point Values: Used to initialize the deck.

Game Logic: Methods to identify legal plays, replace cards, and check for game completion.

Objective: Remove pairs that sum to 13 or single kings.

Gameplay Summary:

The goal of Thirteens is to remove pairs of cards that sum to 13 or single kings.

11. ThirteensGUIRunner.java

The ThirteensGUIRunner.java file serves as the entry point to launch the Thirteens game with the GUI.

Key Steps:

Initializes a ThirteensBoard.

Creates a CardGameGUI instance.

Calls displayGame() to launch the interactive interface.

Execution:

javac *.java
java ThirteensGUIRunner

12. ThirteensSimulation.java

The ThirteensSimulation.java file simulates non-interactive Thirteens games to test the logic and game outcomes.

Key Features:

Simulates multiple games without user input.

Displays win rates and game statistics.

Useful for debugging and performance evaluation.

Execution:

javac *.java
java ThirteensSimulation

How to Run

Compile all Java files using the command javac *.java.

Run either game using its respective runner class (ElevensGUIRunner or ThirteensGUIRunner).

Alternatively, use the provided Elevens.jar file.

Sample Output:

Initial deck state

Card dealing process

Empty deck behavior

Game logic interactions

Interactive GUI with card clicks and game messages

Simulation statistics for non-interactive runs
