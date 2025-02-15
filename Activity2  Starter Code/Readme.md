Card Game Simulation

Overview

This repository contains a Java implementation of a Card class, a Deck class representing a deck of playing cards, and a DeckTester class for testing deck operations.

Files

1. Card.java

The Card class represents an individual playing card with the following attributes:

Rank (e.g., "Ace", "King", "Queen", etc.)

Suit (e.g., "Hearts", "Diamonds", "Clubs", "Spades")

Point Value (an integer representing the card's value)

Key Methods:

public Card(String cardRank, String cardSuit, int cardPointValue): Constructor to initialize a card.

public String suit(): Returns the suit of the card.

public String rank(): Returns the rank of the card.

public int pointValue(): Returns the point value of the card.

public boolean matches(Card otherCard): Compares two cards for equality.

public String toString(): Returns a formatted string representation of the card.

2. Deck.java

The Deck class represents a deck of playing cards and provides methods to shuffle, deal, and check if the deck is empty.

Key Methods:

public Deck(String[] ranks, String[] suits, int[] values): Initializes the deck by pairing ranks, suits, and values.

public boolean isEmpty(): Checks if the deck is empty.

public int size(): Returns the number of undealt cards in the deck.

public void shuffle(): Shuffles the deck.

public Card deal(): Deals a card from the deck.

public String toString(): Returns a formatted string representation of the deck.

3. DeckTester.java

The DeckTester class is a simple test suite designed to validate the functionality of Deck.java.

It initializes multiple decks and verifies their size, checks if a deck is empty, and deals a card.

How to Use

Compile the Java files:

javac Card.java Deck.java DeckTester.java

Run the DeckTester class:

java DeckTester

Modify DeckTester.java to include additional test cases for deck operations.

Future Enhancements

Implement additional shuffling algorithms.

Expand deck functionality for different card games.

Add graphical user interface for card visualization.

License

This project is open-source and free to use for educational purposes.

