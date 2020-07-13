package com.durak.game;

import java.util.Random;

public class Dealer {
	private static final int NUM_OF_CARDS = 6;
	private Deck deck;
	private Random rnd;
	private Card trump;// козырная карта
	
	public Dealer(Deck deck) {
		this.deck = deck;
		rnd = new Random();
	}

// Перетасовка колоды карт
	public void shuffleDeck() {

		for (int i = 0; i < deck.getDeck().size(); i++) {

			int k = rnd.nextInt(35);
			Card tmp = deck.getDeck().get(i);
			deck.getDeck().set(i, deck.getDeck().get(k));
			deck.getDeck().set(k, tmp);
		}

	}
// Берется одна карта по индеку, по умолчанию карта сверху колоды.
	
	public Card getCard(int index) {

		Card tmpCard = deck.getDeck().get(index);
		deck.getDeck().remove(index);
		return tmpCard;

	}

	// Раздача карт по 6
	public void dealCards(Player player) {
		
		
		for (int i = 0; i < NUM_OF_CARDS; i++) {
			player.putCard(getCard(i));

		}
	
	}
	
	public Card getTrump() {

		return trump;
		
	}
	
	//Козырная карта берется с конца колоды
	public Card trumpCard() {
		
		trump =  deck.getDeck().getLast();
		return trump;
		
	}

}
