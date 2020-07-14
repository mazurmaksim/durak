package com.durak.game;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;

import com.durak.game.gfx.ImageLoader;

public class Card {

	private static final int WIDTH = 202, HEIGHT = 281;

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

	public static SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/cards.png"));
	public int rang;
	public int suit;
	public boolean face_up = false;

	public Card(int suit, int rang) {

		this.rang = rang;
		this.suit = suit;
	}

	public BufferedImage faceUp() {

		return display(true);
	}

	public BufferedImage faceDoWn() {

		return display(false);
	}

	private BufferedImage display(boolean face_up) {

		if (face_up == true) {
			// Clubs
			if (rang == SIX && suit == CLUBS) {
				return sheet.crop(0, 0, WIDTH, HEIGHT);
			}

			if (rang == SEVEN && suit == CLUBS) {
				return sheet.crop(202, 0, WIDTH, HEIGHT);
			}

			if (rang == EIGHT && suit == CLUBS) {
				return sheet.crop(404, 0, WIDTH, HEIGHT);
			}

			if (rang == NINE && suit == CLUBS) {

				return sheet.crop(606, 0, WIDTH, HEIGHT);
			}

			if (rang == TEN && suit == CLUBS) {

				return sheet.crop(808, 0, WIDTH, HEIGHT);
			}

			if (rang == JACK && suit == CLUBS) {

				return sheet.crop(1010, 0, WIDTH, HEIGHT);
			}

			if (rang == QUEEN && suit == CLUBS) {

				return sheet.crop(1212, 0, WIDTH, HEIGHT);
			}

			if (rang == KING && suit == CLUBS) {

				return sheet.crop(1414, 0, WIDTH, HEIGHT);
			}

			if (rang == ACE && suit == CLUBS) {

				return sheet.crop(1616, 0, WIDTH, HEIGHT);
			}

			// Spades
			if (rang == SIX && suit == SPADES) {
				return sheet.crop(0, 281, WIDTH, HEIGHT);
			}

			if (rang == SEVEN && suit == SPADES) {
				return sheet.crop(202, 281, WIDTH, HEIGHT);
			}

			if (rang == EIGHT && suit == SPADES) {
				return sheet.crop(404, 281, WIDTH, HEIGHT);
			}

			if (rang == NINE && suit == SPADES) {

				return sheet.crop(606, 281, WIDTH, HEIGHT);
			}

			if (rang == TEN && suit == SPADES) {

				return sheet.crop(808, 281, WIDTH, HEIGHT);
			}

			if (rang == JACK && suit == SPADES) {

				return sheet.crop(1010, 281, WIDTH, HEIGHT);
			}

			if (rang == QUEEN && suit == SPADES) {

				return sheet.crop(1212, 281, WIDTH, HEIGHT);
			}

			if (rang == KING && suit == SPADES) {

				return sheet.crop(1414, 281, WIDTH, HEIGHT);
			}

			if (rang == ACE && suit == SPADES) {

				return sheet.crop(1616, 281, WIDTH, HEIGHT);
			}

			// Hearts
			if (rang == SIX && suit == HEARTS) {
				return sheet.crop(0, 562, WIDTH, HEIGHT);
			}

			if (rang == SEVEN && suit == HEARTS) {
				return sheet.crop(202, 562, WIDTH, HEIGHT);
			}

			if (rang == EIGHT && suit == HEARTS) {
				return sheet.crop(404, 562, WIDTH, HEIGHT);
			}

			if (rang == NINE && suit == HEARTS) {

				return sheet.crop(606, 562, WIDTH, HEIGHT);
			}

			if (rang == TEN && suit == HEARTS) {

				return sheet.crop(808, 562, WIDTH, HEIGHT);
			}

			if (rang == JACK && suit == HEARTS) {

				return sheet.crop(1010, 562, WIDTH, HEIGHT);
			}

			if (rang == QUEEN && suit == HEARTS) {

				return sheet.crop(1212, 562, WIDTH, HEIGHT);
			}

			if (rang == KING && suit == HEARTS) {

				return sheet.crop(1414, 562, WIDTH, HEIGHT);
			}

			if (rang == ACE && suit == HEARTS) {

				return sheet.crop(1616, 562, WIDTH, HEIGHT);
			}

			// Diamonds
			if (rang == SIX && suit == DIAMONDS) {
				return sheet.crop(0, 843, WIDTH, HEIGHT);
			}

			if (rang == SEVEN && suit == DIAMONDS) {
				return sheet.crop(202, 843, WIDTH, HEIGHT);
			}

			if (rang == EIGHT && suit == DIAMONDS) {
				return sheet.crop(404, 843, WIDTH, HEIGHT);
			}

			if (rang == NINE && suit == DIAMONDS) {

				return sheet.crop(606, 843, WIDTH, HEIGHT);
			}

			if (rang == TEN && suit == DIAMONDS) {

				return sheet.crop(808, 843, WIDTH, HEIGHT);
			}

			if (rang == JACK && suit == DIAMONDS) {

				return sheet.crop(1010, 843, WIDTH, HEIGHT);
			}

			if (rang == QUEEN && suit == DIAMONDS) {

				return sheet.crop(1212, 843, WIDTH, HEIGHT);
			}

			if (rang == KING && suit == DIAMONDS) {

				return sheet.crop(1414, 843, WIDTH, HEIGHT);
			}

			if (rang == ACE && suit == DIAMONDS) {

				return sheet.crop(1616, 843, WIDTH, HEIGHT);
			}
		}
		else if(face_up == false) {
			
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

	 public BufferedImage rotateCard(BufferedImage card) throws IOException,InterruptedException{
	        
		 AffineTransform tx = new AffineTransform();
		 tx.translate(card.getHeight() / 2, card.getWidth() / 2);
		 tx.translate(-card.getWidth() / 2, -card.getHeight() / 2);
		 AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
		 BufferedImage newImage =new BufferedImage(card.getHeight(), card.getWidth(), card.getType());
		 op.filter(card, newImage);
	        return newImage;
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
