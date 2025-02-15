Java Card Deck Project

Overview

This project simulates a deck of playing cards using three Java classes. It demonstrates object-oriented principles such as encapsulation, inheritance, and polymorphism.

Card.java: Represents an individual card with rank, suit, and point value.

Deck.java: Represents a deck of cards that can be shuffled and dealt.

DeckTester.java: Tests the functionality of the Deck class.

Elevens.jar: A compiled Java archive (JAR) file, likely related to the Elevens card game activity.

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

How to Run

Compile the Card.java, Deck.java, and DeckTester.java files.

Run DeckTester to observe deck operations.

Sample Output:

Initial deck state

Card dealing process

Empty deck behavior

Next Steps

Extend functionality for additional card ranks and suits.

Improve DeckTester to handle more complex test cases.

Optimize shuffle algorithm for larger decks.
