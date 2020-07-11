package com.durak.game;

import java.util.ArrayList;

public class Player {

	private ArrayList<Card> cards;
	private String name;
	private Card card;
	private Player player;
	

	public Player(String name) {
		cards = new ArrayList<Card>();
		this.name = name;

	}

	public String getName() {

		return name;
	}

	public ArrayList<Card> getCards(Dealer dealer) {

		return cards;

	}

	public void putCard(Card card) {

		cards.add(card);

	}

	public Card getCard() {

		return card;
	}

	public Player getPlayer() {
		
		return player;
	}
	
	// Определить козырь
	public Card checkTrump(Dealer dealer) {
		System.out.println("Козырные карты ");
		for (int i = 0; i < cards.size(); i++) {

			if (dealer.getTrump() != null) {
				if (dealer.getTrump().getSuit() == cards.get(i).getSuit()) {
					
					card = cards.get(i);
					System.out.println( getName() + " "  + card);
				}

			}

		}
		return null;
	}

}
