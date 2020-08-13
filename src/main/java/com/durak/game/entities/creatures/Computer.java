package com.durak.game.entities.creatures;

import java.awt.Graphics;
import java.util.ArrayList;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.Game;
import com.durak.game.states.GameState;

public class Computer extends Player {
	private Game game;
	private float x;
	private float y;
	private boolean faceup;
	public ArrayList<Card> cards;
	private String name;
	private Card card;
	private Deck deck;
	private Card[] selectedCard;
	private GameState playerPlay;
	private ArrayList<Player> players;
	private ArrayList<Card> tmpArr;

	public Computer(Game game, String name, Deck deck, boolean faceup, float x, float y) {
		super(game, name, deck, faceup, x, y);
		cards = new ArrayList<Card>();
		this.game = game;
		this.x = x;
		this.y = y;
		this.deck = deck;
		this.faceup = faceup;

	}

	public void putCard(Card card) {
		card.setX(x);
		card.setY(y);
		cards.add(card);

	}

	@Override
	public void tick() {
		if (game.getKeyManager().f_nine) {
			players = new ArrayList<>(game.getGamestate().getPlayers());
			faceup = true;
		
		}
	}

	public Card playerPlay(Card card) {
		// find smaller card
		Card tmp = cards.get(0);
		int apponent = card.getSuit();
		
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getSuit() == card.getSuit() && cards.get(i).getRang() > card.getRang()) {
				tmp = cards.get(i);
			}

			else if (cards.get(i).getSuit() == game.getGamestate().getDealer().getTrump().getSuit()
					&& card.getSuit() != game.getGamestate().getDealer().getTrump().getSuit()) {
				tmp = cards.get(i);
			}
		}

		return tmp;
	}

	public ArrayList<Card> getCards() {

		return cards;

	}

	public void render(Graphics g) {
		float playerXcoord = 30;
		for (int i = 0; i < getCards().size(); i++) {
			getCards().get(i).setFace_up(faceup);
			getCards().get(i).setX(playerXcoord + x);
			getCards().get(i).render(g);
			playerXcoord += 30;
		}
	}
}
