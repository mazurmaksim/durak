package com.durak.game;

import com.durak.game.entities.Entity;
import com.durak.game.gfx.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Card extends Entity {

	public static final int WIDTH = 202, HEIGHT = 281;

	public static SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/cards.png"));
	public CardsRang rang;
	public CardsSuit suit;
	public boolean face_up = false;
	private float x, y;
	private Game game;

	public Card(Game game, boolean face_up, CardsSuit suit, CardsRang rang, float x, float y) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.rang = rang;
		this.suit = suit;
		this.game = game;
		this.face_up = face_up;
	}

	public boolean isFace_up() {
		return face_up;
	}

	public void setFace_up(boolean face_up) {
		this.face_up = face_up;
	}
	
	public BufferedImage faceUp() {

		return display(true, this);
	}

	public BufferedImage faceDoWn() {

		return display(false, this);
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	
	public BufferedImage display(boolean face_up, Card card) {

		if (face_up) {
			// Clubs
			if (card.getRang() == CardsRang.SIX && card.getSuit() == CardsSuit.CLUBS) {
				return sheet.crop(0, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.SEVEN && card.getSuit() == CardsSuit.CLUBS) {
				return sheet.crop(202, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.EIGHT && card.getSuit() == CardsSuit.CLUBS) {
				return sheet.crop(404, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.NINE && card.getSuit() == CardsSuit.CLUBS) {

				return sheet.crop(606, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.TEN && card.getSuit() == CardsSuit.CLUBS) {

				return sheet.crop(808, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.JACK && card.getSuit() == CardsSuit.CLUBS) {

				return sheet.crop(1010, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.QUEEN && card.getSuit() == CardsSuit.CLUBS) {

				return sheet.crop(1212, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.KING && card.getSuit() == CardsSuit.CLUBS) {

				return sheet.crop(1414, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.ACE && card.getSuit() == CardsSuit.CLUBS) {

				return sheet.crop(1616, 0, WIDTH, HEIGHT);
			}

			// Spades
			if (card.getRang() == CardsRang.SIX && card.getSuit() == CardsSuit.SPADES) {
				return sheet.crop(0, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.SEVEN && card.getSuit() == CardsSuit.SPADES) {
				return sheet.crop(202, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.EIGHT && card.getSuit() == CardsSuit.SPADES) {
				return sheet.crop(404, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.NINE && card.getSuit() == CardsSuit.SPADES) {

				return sheet.crop(606, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.TEN && card.getSuit() == CardsSuit.SPADES) {

				return sheet.crop(808, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.JACK && card.getSuit() == CardsSuit.SPADES) {

				return sheet.crop(1010, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.QUEEN && card.getSuit() == CardsSuit.SPADES) {

				return sheet.crop(1212, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.KING && card.getSuit() == CardsSuit.SPADES) {

				return sheet.crop(1414, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.ACE && card.getSuit() == CardsSuit.SPADES) {

				return sheet.crop(1616, 281, WIDTH, HEIGHT);
			}

			// Hearts
			if (card.getRang() == CardsRang.SIX && card.getSuit() == CardsSuit.HEARTS) {
				return sheet.crop(0, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.SEVEN && card.getSuit() == CardsSuit.HEARTS) {
				return sheet.crop(202, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.EIGHT && card.getSuit() == CardsSuit.HEARTS) {
				return sheet.crop(404, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.NINE && card.getSuit() == CardsSuit.HEARTS) {

				return sheet.crop(606, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.TEN && card.getSuit() == CardsSuit.HEARTS) {

				return sheet.crop(808, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.JACK && card.getSuit() == CardsSuit.HEARTS) {

				return sheet.crop(1010, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.QUEEN && card.getSuit() == CardsSuit.HEARTS) {

				return sheet.crop(1212, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.KING && card.getSuit() == CardsSuit.HEARTS) {

				return sheet.crop(1414, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.ACE && card.getSuit() == CardsSuit.HEARTS) {

				return sheet.crop(1616, 562, WIDTH, HEIGHT);
			}

			// Diamonds
			if (card.getRang() == CardsRang.SIX && card.getSuit() == CardsSuit.DIAMONDS) {
				return sheet.crop(0, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.SEVEN && card.getSuit() == CardsSuit.DIAMONDS) {
				return sheet.crop(202, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.EIGHT && card.getSuit() == CardsSuit.DIAMONDS) {
				return sheet.crop(404, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.NINE && card.getSuit() == CardsSuit.DIAMONDS) {

				return sheet.crop(606, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.TEN && card.getSuit() == CardsSuit.DIAMONDS) {

				return sheet.crop(808, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.JACK && card.getSuit() == CardsSuit.DIAMONDS) {

				return sheet.crop(1010, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.QUEEN && card.getSuit() == CardsSuit.DIAMONDS) {

				return sheet.crop(1212, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.KING && card.getSuit() == CardsSuit.DIAMONDS) {

				return sheet.crop(1414, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == CardsRang.ACE && card.getSuit() == CardsSuit.DIAMONDS) {

				return sheet.crop(1616, 843, WIDTH, HEIGHT);
			}
		} else if (face_up == false) {

			return sheet.crop(1616 + 202, 0, WIDTH, HEIGHT);

		}
		return null;
	}

	public CardsSuit getSuit() {

		return suit;
	}

	public CardsRang getRang() {

		return rang;

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

	public float getX() {
		return x;

	}

	public float getY() {
		return y;

	}

	@Override
	public void tick() {
		this.tick();
	}

	@Override
	public void render(Graphics g) {
		if (face_up) {
			g.drawImage(faceUp(), (int) x, (int) y, null);
		}
		if (!face_up) {
		
		g.drawImage(faceDoWn(), (int) x, (int) y, null);
		}
	}

}
