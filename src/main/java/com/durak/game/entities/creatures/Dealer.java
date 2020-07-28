package com.durak.game.entities.creatures;

import java.awt.Graphics;
import java.util.Random;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.entities.Entity;

public class Dealer extends Entity{
	private static final int NUM_OF_CARDS = 6;
	private Deck deck;
	private Random rnd;
	private Card trump;// �������� �����
	private float x,y;
	
	public Dealer(Deck deck, float x, float y) {
		super(x,y);
		this.x = x;
		this.y = y;
		this.deck = deck;
		rnd = new Random();
	}

// ����������� ������ ����
	public void shuffleDeck() {

		for (int i = 0; i < deck.getDeck().size(); i++) {

			int k = rnd.nextInt(35);
			Card tmp = deck.getDeck().get(i);
			deck.getDeck().set(i, deck.getDeck().get(k));
			deck.getDeck().set(k, tmp);
		}

	}
// ������� ���� ����� �� ������, �� ��������� ����� ������ ������.
	
	public Card getCard(int index) {

		Card tmpCard = deck.getDeck().get(index);
		deck.getDeck().remove(index);
		return tmpCard;

	}

	// ������� ���� �� 6
	public void dealCards(Player player) {
		
		
		for (int i = 0; i < NUM_OF_CARDS; i++) {
			player.putCard(getCard(i));

		}
	
	}
	
	public Card getTrump() {

		return trump;
		
	}
	
	//�������� ����� ������� � ����� ������
	public Card trumpCard() {
		
		trump =  deck.getDeck().getLast();
		return trump;
		
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(trump.faceUp(), (int)x, (int)y, null);
	}

}
