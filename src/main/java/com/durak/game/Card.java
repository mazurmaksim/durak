package com.durak.game;

import java.awt.image.BufferedImage;

public class Card {

	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;

	// suits
	public static final int DIAMONDS = 4;
	public static final int HEARTS = 3;
	public static final int SPADES = 6;
	public static final int CLUBS = 5;

	private BufferedImage sheet;

	public int rang;
	public int suit;
	public boolean cardShirt;

	public Card(int suit, int rang, BufferedImage sheet) {

		this.rang = rang;
		this.suit = suit;
		this.sheet = sheet;

	}

	public BufferedImage getSheet() {

		return sheet;
	}

	public int getSuit() {

		return suit;
	}

	public int getRang() {

		return rang;

	}

	public String toString() {

		String strSuit = "";
		String strRang = "";

		switch (suit) {
		case 4:
			strSuit = "DIAMONDS";
			break;
		case 3:
			strSuit = "HEARTS";
			break;
		case 6:
			strSuit = "SPADES";
			break;
		case 5:
			strSuit = "CLUBS";
		}

		switch (rang) {
		case 6:
			strRang = "SIX";
			break;
		case 7:
			strRang = "SEVEN";
			break;
		case 8:
			strRang = "EIGHT";
			break;
		case 9:
			strRang = "NINE";
			break;
		case 10:
			strRang = "TEN";
			break;
		case 11:
			strRang = "JACK";
			break;
		case 12:
			strRang = "QUEEN";
			break;
		case 13:
			strRang = "KING";
			break;
		case 14:
			strRang = "ACE";
			break;
		}

		return " <<== " + strSuit + " " + strRang + " ==>> " + "\n";

	}

}
