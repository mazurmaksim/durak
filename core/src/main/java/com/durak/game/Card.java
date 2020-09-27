package com.durak.game;

public class Card {

	public CardsRang rang;
	public CardsSuit suit;
	public boolean face_up = false;

	public Card(boolean face_up, CardsSuit suit, CardsRang rang) {
		this.rang = rang;
		this.suit = suit;
		this.face_up = face_up;
	}

	public void setSuit(CardsSuit suit){
		this.suit = suit;
	}

	public void setRang(CardsRang rang){
		this.rang = rang;
	}

	public boolean isFace_up() {
		return face_up;
	}

	public void setFace_up(boolean face_up) {
		this.face_up = face_up;
	}

	public CardsSuit getSuit() {

		return suit;
	}

	public CardsRang getRang() {

		return rang;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Card card = (Card) o;

		if (rang != card.rang) return false;
		return suit == card.suit;
	}

	@Override
	public int hashCode() {
		int result = rang.hashCode();
		result = 31 * result + suit.hashCode();
		return result;
	}

	public String toString() {

		String strSuit = "";
		String strRang = "";

		switch (suit) {
			case DIAMONDS:
			strSuit = "DIAMONDS";
			break;
			case HEARTS:
			strSuit = "HEARTS";
			break;
			case SPADES:
			strSuit = "SPADES";
			break;
			case CLUBS:
			strSuit = "CLUBS";
		}

		switch (rang) {
			case SIX:
			strRang = "SIX";
			break;
			case SEVEN:
			strRang = "SEVEN";
			break;
			case EIGHT:
			strRang = "EIGHT";
			break;
			case NINE:
			strRang = "NINE";
			break;
			case TEN:
			strRang = "TEN";
			break;
			case JACK:
			strRang = "JACK";
			break;
			case QUEEN:
			strRang = "QUEEN";
			break;
			case KING:
			strRang = "KING";
			break;
			case ACE:
			strRang = "ACE";
			break;
		}
	return " <<== " + strSuit + " " + strRang + " ==>> " + "\n";
	}
}
