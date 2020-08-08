package com.durak.game.entities.creatures;

import java.awt.Button;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.Display;
import com.durak.game.Game;
import com.durak.game.Table;

public class Player extends Creature {

	public static final float CARD_UPLIFT = 50;
	public ArrayList<Card> cards;
	private String name;
	private Card card;
	private float x, y;
	private Deck deck;
	private ArrayList<Card> selectedCard;
	private JButton take;
	private JButton clear;
	private JFrame display;
	private Player player;
	private boolean faceup = false;
	private boolean flag;

	private Game game;

	public Player(Game game, String name, Deck deck, boolean faceup, float x, float y) {
		super(x, y);
		cards = new ArrayList<Card>();
		this.name = name;
		this.x = x;
		this.y = y;
		this.faceup = faceup;
		this.game = game;
		this.deck = deck;
		selectedCard = new ArrayList<>();

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
		card.setX(x);
		card.setY(y);
		cards.add(card);

	}

	public void setCoords() {

		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).setX(x);
			cards.get(i).setY(y);

		}
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

	int i = 0;

	private Card tmpCard;
	@Override
	public void tick() {
		
		float tmpY = y - CARD_UPLIFT;
//		if (game.getKeyManager().up) {
//			y -= 3;
//		}
//
//		if (game.getKeyManager().down) {
//			y += 3;
//		}
//		if (game.getKeyManager().left) {
//			x -= 3;
//		}

		if (game.getKeyManager().enter) {
			
				if(flag) {
					flag= false;
				
				//	tmpCard.setY(350);
					
					SelectCard(tmpCard);
					cards.remove(tmpCard);
					for(int i=0;i < getSelectedCard().size();i++) {
						getSelectedCard().get(i).setY(350);
					}
					
				}

		}

		if (game.getKeyManager().right) {

			if (i > 0) {
				cards.get(i - 1).setY(y);
			}
			if (i < cards.size()) {
				cards.get(i).setY(tmpY);
				tmpCard = cards.get(i);
				flag = true;
				i++;
				try {
					Thread.currentThread();
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} else {
				i = 0;
			}

		}

	}

	public void SelectCard(Card card) {

		selectedCard.add(card);

	}

	public ArrayList<Card> getSelectedCard() {
		return selectedCard;
	}

	@Override
	public void render(Graphics g) {

		// Player 1 cards
		float playerXcoord = 30;
		for (int i = 0; i < this.getCards().size(); i++) {
			this.cards.get(i).setFace_up(faceup);
			this.cards.get(i).setX(playerXcoord + x);
			this.cards.get(i).render(g);
			playerXcoord += 30;
		}
		playerXcoord = 30;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

}
