package com.durak.game.entities.creatures;

import java.awt.Graphics;
import java.util.ArrayList;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.Game;
import com.durak.game.Table;

public class Player extends Creature {

	public ArrayList<Card> cards;
	private String name;
	private Card card;
	private float x, y;

	private Player player;
	private boolean faceup = false;

	private Game game;

	public Player(Game game, String name, Deck deck, boolean faceup, float x, float y) {
		super(x, y);
		cards = new ArrayList<Card>();
		this.name = name;
		this.x = x;
		this.y = y;
		this.faceup = faceup;
		this.game = game;

	}

	public float getX() {

		return x;
	}

	public float getY() {

		return y;
	}

	public String getName() {

		return name;
	}

	public ArrayList<Card> getCards() {

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

	@Override
	public void tick() {
		for (int i = 0; i < getCards().size(); i++) {
			System.out.println(game.getMauseManager().getMouseX());
			if (game.getMauseManager().isLeftPressed()
					&& game.getMauseManager().getMouseX() ==  getCards().get(i).getX()
					&& game.getMauseManager().getMouseY() ==  getCards().get(i).getY()) {
				//getCards().get(i).face_up = false;
				
			}
		}

	}

	@Override
	public void render(Graphics g) {

		// Player 1 cards
		float playerXcoord = 30;
		if (faceup == true) {
			for (int i = 0; i < getCards().size(); i++) {
				g.drawImage(getCards().get(i).faceUp(), (int) (x + playerXcoord), (int) y, null);
				playerXcoord += 30;
			}
		} else
			for (int i = 0; i < getCards().size(); i++) {
				g.drawImage(getCards().get(i).faceDoWn(), (int) (x + playerXcoord), (int) y, null);
				playerXcoord += 30;
			}
		playerXcoord = 30;
	}

}
