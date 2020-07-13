package com.durak.game;

import java.util.*;

import com.durak.game.gfx.ImageLoader;

public class Deck {

	public static LinkedList<Card> deck;
	private static final int WIDTH = 202, HEIGHT = 281;

	public Deck() {

		//buildCards();

	}

	public static void buildCards() {
		deck = new LinkedList<Card>();
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/cards.png"));
		
		//Clubs
		deck.add(new Card(Card.CLUBS, Card.SIX, sheet.crop(0, 0, WIDTH, HEIGHT)));
		deck.add(new Card(Card.CLUBS, Card.SEVEN, sheet.crop(202, 0, WIDTH, HEIGHT)));
		deck.add(new Card(Card.CLUBS, Card.EIGHT, sheet.crop(404, 0, WIDTH, HEIGHT)));
		deck.add(new Card(Card.CLUBS, Card.NINE, sheet.crop(606, 0, WIDTH, HEIGHT)));
		deck.add(new Card(Card.CLUBS, Card.TEN, sheet.crop(808, 0, WIDTH, HEIGHT)));
		deck.add(new Card(Card.CLUBS, Card.JACK, sheet.crop(1010, 0, WIDTH, HEIGHT)));
		deck.add(new Card(Card.CLUBS, Card.QUEEN, sheet.crop(1212, 0, WIDTH, HEIGHT)));
		deck.add(new Card(Card.CLUBS, Card.KING, sheet.crop(1414, 0, WIDTH, HEIGHT)));
		deck.add(new Card(Card.CLUBS, Card.ACE, sheet.crop(1616, 0, WIDTH, HEIGHT)));
		
		//Spades
		deck.add(new Card(Card.SPADES, Card.SIX, sheet.crop(0, 281, WIDTH, HEIGHT)));
		deck.add(new Card(Card.SPADES, Card.SEVEN, sheet.crop(202, 281, WIDTH, HEIGHT)));
		deck.add(new Card(Card.SPADES, Card.EIGHT, sheet.crop(404, 281, WIDTH, HEIGHT)));
		deck.add(new Card(Card.SPADES, Card.NINE, sheet.crop(606, 281, WIDTH, HEIGHT)));
		deck.add(new Card(Card.SPADES, Card.TEN, sheet.crop(808, 281, WIDTH, HEIGHT)));
		deck.add(new Card(Card.SPADES, Card.JACK, sheet.crop(1010, 281, WIDTH, HEIGHT)));
		deck.add(new Card(Card.SPADES, Card.QUEEN, sheet.crop(1212, 281, WIDTH, HEIGHT)));
		deck.add(new Card(Card.SPADES, Card.KING, sheet.crop(1414, 281, WIDTH, HEIGHT)));
		deck.add(new Card(Card.SPADES, Card.ACE, sheet.crop(1616, 281, WIDTH, HEIGHT)));

		//Hearts
		deck.add(new Card(Card.HEARTS, Card.SIX, sheet.crop(0, 562, WIDTH, HEIGHT)));
		deck.add(new Card(Card.HEARTS, Card.SEVEN, sheet.crop(202, 562, WIDTH, HEIGHT)));
		deck.add(new Card(Card.HEARTS, Card.EIGHT, sheet.crop(404, 562, WIDTH, HEIGHT)));
		deck.add(new Card(Card.HEARTS, Card.NINE, sheet.crop(606, 562, WIDTH, HEIGHT)));
		deck.add(new Card(Card.HEARTS, Card.TEN, sheet.crop(808, 562, WIDTH, HEIGHT)));
		deck.add(new Card(Card.HEARTS, Card.JACK, sheet.crop(1010, 562, WIDTH, HEIGHT)));
		deck.add(new Card(Card.HEARTS, Card.QUEEN, sheet.crop(1212, 562, WIDTH, HEIGHT)));
		deck.add(new Card(Card.HEARTS, Card.KING, sheet.crop(1414, 562, WIDTH, HEIGHT)));
		deck.add(new Card(Card.HEARTS, Card.ACE, sheet.crop(1616, 562, WIDTH, HEIGHT)));

		//Diamonds
		deck.add(new Card(Card.DIAMONDS, Card.SIX, sheet.crop(0, 843, WIDTH, HEIGHT)));     
		deck.add(new Card(Card.DIAMONDS, Card.SEVEN, sheet.crop(202, 843, WIDTH, HEIGHT))); 
		deck.add(new Card(Card.DIAMONDS, Card.EIGHT, sheet.crop(404, 843, WIDTH, HEIGHT))); 
		deck.add(new Card(Card.DIAMONDS, Card.NINE, sheet.crop(606, 843, WIDTH, HEIGHT)));  
		deck.add(new Card(Card.DIAMONDS, Card.TEN, sheet.crop(808, 843, WIDTH, HEIGHT)));   
		deck.add(new Card(Card.DIAMONDS, Card.JACK, sheet.crop(1010, 843, WIDTH, HEIGHT))); 
		deck.add(new Card(Card.DIAMONDS, Card.QUEEN, sheet.crop(1212, 843, WIDTH, HEIGHT)));
		deck.add(new Card(Card.DIAMONDS, Card.KING, sheet.crop(1414, 843, WIDTH, HEIGHT))); 
		deck.add(new Card(Card.DIAMONDS, Card.ACE, sheet.crop(1616, 843, WIDTH, HEIGHT)));  
                                                                                            
	}

	public static LinkedList<Card> getDeck() {

		return deck;

	}

}
