package com.durak.game.states;

import java.awt.Graphics;
import java.util.ArrayList;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.Game;
import com.durak.game.Table;
import com.durak.game.entities.creatures.Computer;
import com.durak.game.entities.creatures.Dealer;
import com.durak.game.entities.creatures.Player;

public class GameState extends State {

	private Deck deck;
	private Dealer dlr;
	private Card trump;
	private Table table;
	
	private ArrayList<Player> players = new ArrayList<>();
	
	public GameState(Game game) {
		super(game);
		players.add( new Player(game,"Maks", deck, true, 480, 755 ));
		players.add( new Computer(game, "Comp", deck, true, 480, 10));
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
		for(Player plr : players)
		plr.tick();
	}
	
	@Override
	public void render(Graphics g) {
		table.render(g);
		dlr.render(g);
		players.get(0).render(g);
		players.get(1).render(g);
		trump.render(g);
		deck.render(g);
		
	}
	public Dealer getDealer() {
		return dlr;
	}
}
