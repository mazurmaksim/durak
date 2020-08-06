package com.durak.game;

import java.awt.Graphics;
import java.util.*;

import com.durak.game.entities.Entity;

public class Deck extends Entity {

	private Game game;
	public LinkedList<Card> deck;
	private float x, y;

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public Deck(Game game, float x, float y) {

		super(x, y);
		this.x = x;
		this.y = y;
		this.game = game;

	}

	public int size() {
		return deck.size();
	}

	public void buildCards() {
		deck = new LinkedList<Card>();

		// Clubs
		deck.add(new Card(game,false,Card.CLUBS, Card.SIX, x, y));
		deck.add(new Card(game,false,Card.CLUBS, Card.SEVEN, x, y));
		deck.add(new Card(game,false,Card.CLUBS, Card.EIGHT, x, y));
		deck.add(new Card(game,false,Card.CLUBS, Card.NINE, x, y));
		deck.add(new Card(game,false,Card.CLUBS, Card.TEN, x, y));
		deck.add(new Card(game,false,Card.CLUBS, Card.JACK, x, y));
		deck.add(new Card(game,false,Card.CLUBS, Card.QUEEN, x, y));
		deck.add(new Card(game,false,Card.CLUBS, Card.KING, x, y));
		deck.add(new Card(game,false,Card.CLUBS, Card.ACE, x, y));

		// Spades
		deck.add(new Card(game,false,Card.SPADES, Card.SIX, x, y));
		deck.add(new Card(game,false,Card.SPADES, Card.SEVEN, x, y));
		deck.add(new Card(game,false,Card.SPADES, Card.EIGHT, x, y));
		deck.add(new Card(game,false,Card.SPADES, Card.NINE, x, y));
		deck.add(new Card(game,false,Card.SPADES, Card.TEN, x, y));
		deck.add(new Card(game,false,Card.SPADES, Card.JACK, x, y));
		deck.add(new Card(game,false,Card.SPADES, Card.QUEEN, x, y));
		deck.add(new Card(game,false,Card.SPADES, Card.KING, x, y));
		deck.add(new Card(game,false,Card.SPADES, Card.ACE, x, y));

		// Hearts
		deck.add(new Card(game,false,Card.HEARTS, Card.SIX, x, y));
		deck.add(new Card(game,false,Card.HEARTS, Card.SEVEN, x, y));
		deck.add(new Card(game,false,Card.HEARTS, Card.EIGHT, x, y));
		deck.add(new Card(game,false,Card.HEARTS, Card.NINE, x, y));
		deck.add(new Card(game,false,Card.HEARTS, Card.TEN, x, y));
		deck.add(new Card(game,false,Card.HEARTS, Card.JACK, x, y));
		deck.add(new Card(game,false,Card.HEARTS, Card.QUEEN, x, y));
		deck.add(new Card(game,false,Card.HEARTS, Card.KING, x, y));
		deck.add(new Card(game,false,Card.HEARTS, Card.ACE, x, y));

		// Diamonds
		deck.add(new Card(game,false,Card.DIAMONDS, Card.SIX, x, y));
		deck.add(new Card(game,false,Card.DIAMONDS, Card.SEVEN, x, y));
		deck.add(new Card(game,false,Card.DIAMONDS, Card.EIGHT, x, y));
		deck.add(new Card(game,false,Card.DIAMONDS, Card.NINE, x, y));
		deck.add(new Card(game,false,Card.DIAMONDS, Card.TEN, x, y));
		deck.add(new Card(game,false,Card.DIAMONDS, Card.JACK, x, y));
		deck.add(new Card(game,false,Card.DIAMONDS, Card.QUEEN, x, y));
		deck.add(new Card(game,false,Card.DIAMONDS, Card.KING, x, y));
		deck.add(new Card(game,false,Card.DIAMONDS, Card.ACE, x, y));

	}

	public LinkedList<Card> getDeck() {

		return deck;

	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		int count =3;
		for(int i=0;i<deck.size();i++) {
			
			g.drawImage(deck.get(i).faceDoWn(), 80-count-i, 350, null);
			count++;
			
		}
	}

}
