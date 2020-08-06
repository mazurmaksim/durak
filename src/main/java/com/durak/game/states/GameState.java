package com.durak.game.states;

import java.awt.Graphics;
import java.util.ArrayList;

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
	private ArrayList<Player> players = new ArrayList<>();
	
	public GameState(Game game) {
		super(game);
		player = new Player(game,"Maks", deck, true, 480, 755);
		comp = new Player(game, "Comp", deck, false, 480, 10);
		players.add(player);
		players.add(comp);
		deck = new Deck(game,80, 350);
		deck.buildCards();
		dlr = new Dealer(deck, 200, 350);
		dlr.shuffleDeck();
		dlr.dealCards(players.get(0));
		dlr.dealCards(players.get(1));
		trump = dlr.trumpCard();
		table = new Table(0, 0);
		
	}

	public ArrayList<Player> getPlayers(){
		return players;
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
		players.get(0).render(g);
		trump.render(g);
		deck.render(g);
		players.get(1).render(g);
	}

}
