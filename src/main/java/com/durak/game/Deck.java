package com.durak.game;

import java.util.*;

public class Deck {

	private LinkedList<Card> deck;

	public Deck() {

		buildCards();

	}

	private void buildCards() {
		deck = new LinkedList<Card>();
		
		deck.add(new Card( Card.CLUBS, Card.SIX));
		deck.add(new Card( Card.CLUBS, Card.SEVEN));
		deck.add(new Card( Card.CLUBS, Card.EIGHT));
		deck.add(new Card( Card.CLUBS, Card.NINE));
		deck.add(new Card( Card.CLUBS, Card.TEN));
		deck.add(new Card( Card.CLUBS, Card.JACK));
		deck.add(new Card( Card.CLUBS, Card.QUEEN));
		deck.add(new Card( Card.CLUBS, Card.KING));
		deck.add(new Card( Card.CLUBS, Card.ACE));
		
		deck.add(new Card( Card.SPADES, Card.SIX));
		deck.add(new Card( Card.SPADES, Card.SEVEN));
		deck.add(new Card( Card.SPADES, Card.EIGHT));
		deck.add(new Card( Card.SPADES, Card.NINE));
		deck.add(new Card( Card.SPADES, Card.TEN));
		deck.add(new Card( Card.SPADES, Card.JACK));
		deck.add(new Card( Card.SPADES, Card.QUEEN));
		deck.add(new Card( Card.SPADES, Card.KING));
		deck.add(new Card( Card.SPADES, Card.ACE));
		
		deck.add(new Card( Card.HEARTS, Card.SIX));
		deck.add(new Card( Card.HEARTS, Card.SEVEN));
		deck.add(new Card( Card.HEARTS, Card.EIGHT));
		deck.add(new Card( Card.HEARTS, Card.NINE));
		deck.add(new Card( Card.HEARTS, Card.TEN));
		deck.add(new Card( Card.HEARTS, Card.JACK));
		deck.add(new Card( Card.HEARTS, Card.QUEEN));
		deck.add(new Card( Card.HEARTS, Card.KING));
		deck.add(new Card( Card.HEARTS, Card.ACE));
		
		deck.add(new Card( Card.DIAMONDS, Card.SIX));
		deck.add(new Card( Card.DIAMONDS, Card.SEVEN));
		deck.add(new Card( Card.DIAMONDS, Card.EIGHT));
		deck.add(new Card( Card.DIAMONDS, Card.NINE));
		deck.add(new Card( Card.DIAMONDS, Card.TEN));
		deck.add(new Card( Card.DIAMONDS, Card.JACK));
		deck.add(new Card( Card.DIAMONDS, Card.QUEEN));
		deck.add(new Card( Card.DIAMONDS, Card.KING));
		deck.add(new Card( Card.DIAMONDS, Card.ACE));
		
	}
	public LinkedList<Card> getDeck() {
		
		return deck;
		
	}

}
