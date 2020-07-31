package com.durak.game.states;

import java.awt.Graphics;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.Game;
import com.durak.game.Table;
import com.durak.game.entities.creatures.Dealer;
import com.durak.game.entities.creatures.Player;

public class GameState extends State {

	private Deck deck;
	private Dealer dlr;
	private Card trump;
	private Table table;

	private Player player;
	private Player comp;

	public GameState(Game game) {
		super(game);
		player = new Player(game,"Maks", deck, true, 480, 755);
		comp = new Player(game, "Comp", deck, false, 480, 10);
		deck = new Deck(game,80, 350);
		deck.buildCards();
		dlr = new Dealer(deck, 200, 350);
		dlr.shuffleDeck();
		dlr.dealCards(player);
		dlr.dealCards(comp);
		trump = dlr.trumpCard();
		table = new Table(0, 0);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		
		table.render(g);
		dlr.render(g);
		player.render(g);
		trump.render(g);
		deck.render(g);
		comp.render(g);
	}

}
