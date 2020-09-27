package com.durak.game.entities.creatures;

import java.util.ArrayList;
import java.util.Random;

import com.durak.game.Card;
import com.durak.game.Deck;

public class Dealer{
	private static final int NUM_OF_CARDS = 6;
	public ArrayList<Card> cards;
	private Deck deck;
	private Random rnd;
	private Card trump;
	private float x,y;
	
	public Dealer(Deck deck) {
		this.x = x;
		this.y = y;
		this.deck = deck;
		rnd = new Random();
	}


	public void shuffleDeck() {

		for (int i = 0; i < deck.getDeck().size(); i++) {

			int k = rnd.nextInt(35);
			Card tmp = deck.getDeck().get(i);
			deck.getDeck().set(i, deck.getDeck().get(k));
			deck.getDeck().set(k, tmp);
		}

	}

	public Card getCard(int index) {

		Card tmpCard = deck.getDeck().get(index);
		deck.getDeck().remove(index);
		return tmpCard;

	}


	public void putCard(Card card) {
		card.setX(x);
		card.setY(y);
		cards.add(card);

	}
	
	public Card getTrump() {

		return trump;
		
	}
	
	public Card trumpCard() {
		
		trump =  deck.getDeck().getLast();
		return trump;
		
	}

}
