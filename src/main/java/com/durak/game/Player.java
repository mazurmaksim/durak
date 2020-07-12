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

	// Определить найменьшую козырь
	public Card findSmallerTrump(Dealer dealer) {

		System.out.println("Trump Cards is ");
		Card tmp = cards.get(0);

		for (int i = 0; i < cards.size(); i++) {

			if (dealer.getTrump() != null) {
				if (dealer.getTrump().getSuit() == cards.get(i).getSuit()) {
					if (cards.get(i).getRang() < tmp.getRang()) {

						tmp = cards.get(i);

					}
				}

			}

		}

		return tmp;
	}

	public static void main(String[] args) {

		int[] mas = { 89, 5, 8, 3, 6, 2, 45 };

		int tmp = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] < tmp) {
				tmp = mas[i];
			}

		}
		System.out.print(tmp);
	}

}
