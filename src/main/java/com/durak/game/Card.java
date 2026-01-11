package com.durak.game;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;

import com.durak.game.entities.Entity;
import com.durak.game.entities.creatures.Player;
import com.durak.game.gfx.ImageLoader;

public class Card extends Entity {

	public static final int WIDTH = 202, HEIGHT = 281;

	// rang
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

	public static SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/cards.png"));
	public int rang;
	public int suit;
	public boolean face_up = false;
	private float x, y;
	private Game game;

	public Card(Game game, boolean face_up, int suit, int rang, float x, float y) {
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

		if (face_up == true) {
			// Clubs
			if (card.getRang() == SIX && card.getSuit() == CLUBS) {
				return sheet.crop(0, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == SEVEN && card.getSuit() == CLUBS) {
				return sheet.crop(202, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == EIGHT && card.getSuit() == CLUBS) {
				return sheet.crop(404, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == NINE && card.getSuit() == CLUBS) {

				return sheet.crop(606, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == TEN && card.getSuit() == CLUBS) {

				return sheet.crop(808, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == JACK && card.getSuit() == CLUBS) {

				return sheet.crop(1010, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == QUEEN && card.getSuit() == CLUBS) {

				return sheet.crop(1212, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == KING && card.getSuit() == CLUBS) {

				return sheet.crop(1414, 0, WIDTH, HEIGHT);
			}

			if (card.getRang() == ACE && card.getSuit() == CLUBS) {

				return sheet.crop(1616, 0, WIDTH, HEIGHT);
			}

			// Spades
			if (card.getRang() == SIX && card.getSuit() == SPADES) {
				return sheet.crop(0, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == SEVEN && card.getSuit() == SPADES) {
				return sheet.crop(202, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == EIGHT && card.getSuit() == SPADES) {
				return sheet.crop(404, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == NINE && card.getSuit() == SPADES) {

				return sheet.crop(606, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == TEN && card.getSuit() == SPADES) {

				return sheet.crop(808, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == JACK && card.getSuit() == SPADES) {

				return sheet.crop(1010, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == QUEEN && card.getSuit() == SPADES) {

				return sheet.crop(1212, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == KING && card.getSuit() == SPADES) {

				return sheet.crop(1414, 281, WIDTH, HEIGHT);
			}

			if (card.getRang() == ACE && card.getSuit() == SPADES) {

				return sheet.crop(1616, 281, WIDTH, HEIGHT);
			}

			// Hearts
			if (card.getRang() == SIX && card.getSuit() == HEARTS) {
				return sheet.crop(0, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == SEVEN && card.getSuit() == HEARTS) {
				return sheet.crop(202, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == EIGHT && card.getSuit() == HEARTS) {
				return sheet.crop(404, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == NINE && card.getSuit() == HEARTS) {

				return sheet.crop(606, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == TEN && card.getSuit() == HEARTS) {

				return sheet.crop(808, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == JACK && card.getSuit() == HEARTS) {

				return sheet.crop(1010, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == QUEEN && card.getSuit() == HEARTS) {

				return sheet.crop(1212, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == KING && card.getSuit() == HEARTS) {

				return sheet.crop(1414, 562, WIDTH, HEIGHT);
			}

			if (card.getRang() == ACE && card.getSuit() == HEARTS) {

				return sheet.crop(1616, 562, WIDTH, HEIGHT);
			}

			// Diamonds
			if (card.getRang() == SIX && card.getSuit() == DIAMONDS) {
				return sheet.crop(0, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == SEVEN && card.getSuit() == DIAMONDS) {
				return sheet.crop(202, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == EIGHT && card.getSuit() == DIAMONDS) {
				return sheet.crop(404, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == NINE && card.getSuit() == DIAMONDS) {

				return sheet.crop(606, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == TEN && card.getSuit() == DIAMONDS) {

				return sheet.crop(808, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == JACK && card.getSuit() == DIAMONDS) {

				return sheet.crop(1010, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == QUEEN && card.getSuit() == DIAMONDS) {

				return sheet.crop(1212, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == KING && card.getSuit() == DIAMONDS) {

				return sheet.crop(1414, 843, WIDTH, HEIGHT);
			}

			if (card.getRang() == ACE && card.getSuit() == DIAMONDS) {

				return sheet.crop(1616, 843, WIDTH, HEIGHT);
			}
		} else if (face_up == false) {

			return sheet.crop(1616 + 202, 0, WIDTH, HEIGHT);

		}
		return null;
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
