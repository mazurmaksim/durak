package com.durak.game;

import java.util.ArrayList;

import com.durak.game.entities.creatures.Player;


public class Rools {

	private Player player;
	private ArrayList<Card> cards;
	private Card[] selectedCard;
	private GameState computer;
	
	public Rools() {
		
	}

public void BeatCard(Player player) {
		
		if (selectedCard[0] != null) {
			for (int i = 0; i < cards.size(); i++) {
				if (computer.getPlayer()[0].cards.get(i).getSuit() == computer.getPlayer()[1].selectedCard[0].getSuit()
						&& computer.getPlayer()[0].cards.get(i).getRang() > computer.getPlayer()[1].selectedCard[0].getSuit()) {
					computer.getPlayer()[0].cards.get(i).faceUp();
					computer.getPlayer()[0].cards.get(i).setY(340);
				}

			}
		}
}
