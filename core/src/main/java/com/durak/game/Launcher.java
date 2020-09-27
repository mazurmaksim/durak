package com.durak.game;

public class Launcher {

	public static void main(String[] args) {
	Deck deck = new Deck();
		for (Card card: deck.getDeck()
			 ) {
			System.out.println(card);
		}
	}

}
