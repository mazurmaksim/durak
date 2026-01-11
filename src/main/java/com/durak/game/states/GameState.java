package com.durak.game.states;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.Game;
import com.durak.game.Table;
import com.durak.game.entities.creatures.Computer;
import com.durak.game.entities.creatures.Dealer;
import com.durak.game.entities.creatures.Player;

public class GameState extends State {

    private final Deck deck;
    private final Dealer dlr;
    private final Table table;

    private Card trump;

    private final ArrayList<Player> players = new ArrayList<>();

    public GameState(Game game) {
        super(game);

        // 1) Create deck first
        deck = new Deck(game, 80, 350);
        deck.buildCards();

        // 2) Then dealer that uses deck
        dlr = new Dealer(deck, 200, 350);
        dlr.shuffleDeck();

        // 3) Then players that may rely on deck/game state
        players.add(new Player(game, "Maks", deck, true, 480, 755));
        players.add(new Computer(game, "Comp", deck, true, 480, 10));

        // 4) Deal cards
        dlr.dealCards(players.get(0));
        dlr.dealCards(players.get(1));

        // 5) Trump + table
        trump = dlr.trumpCard();
        table = new Table(0, 0);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Dealer getDealer() {
        return dlr;
    }

    @Override
    public void tick() {
        for (Player plr : players) {
            plr.tick();
        }
    }

    @Override
    public void render(Graphics g) {
        table.render(g);
        dlr.render(g);

        players.get(0).render(g);
        players.get(1).render(g);

        if (trump != null) {
            trump.render(g);
        }

        deck.render(g);
    }
}
