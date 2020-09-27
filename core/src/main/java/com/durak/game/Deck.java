package com.durak.game;

import java.awt.Graphics;
import java.util.*;

import com.durak.game.entities.Entity;

public class Deck extends Entity {

    private Game game;
    public LinkedList<Card> deck;
    private float x, y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Deck(Game game, float x, float y) {

        super(x, y);
        this.x = x;
        this.y = y;
        this.game = game;

    }

    public int size() {
        return deck.size();
    }

    public void buildCards() {
        deck = new LinkedList<Card>();
    // Добавляю карты в колоду.
        for (int i = 0; i < CardsSuit.values().length; i++) {
			for (int j=0;j<CardsRang.values().length;j++){
                deck.add(new Card(game, false, CardsSuit.values()[i], CardsRang.values()[j], x, y));
            }
        }

//        // Clubs
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.SIX, x, y));
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.SEVEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.EIGHT, x, y));
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.NINE, x, y));
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.TEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.JACK, x, y));
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.QUEEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.KING, x, y));
//        deck.add(new Card(game, false, CardsSuit.CLUBS, CardsRang.ACE, x, y));
//
//        // Spades
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.SIX, x, y));
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.SEVEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.EIGHT, x, y));
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.NINE, x, y));
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.TEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.JACK, x, y));
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.QUEEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.KING, x, y));
//        deck.add(new Card(game, false, CardsSuit.SPADES, CardsRang.ACE, x, y));
//
//        // Hearts
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.SIX, x, y));
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.SEVEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.EIGHT, x, y));
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.NINE, x, y));
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.TEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.JACK, x, y));
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.QUEEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.KING, x, y));
//        deck.add(new Card(game, false, CardsSuit.HEARTS, CardsRang.ACE, x, y));
//
//        // Diamonds
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.SIX, x, y));
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.SEVEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.EIGHT, x, y));
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.NINE, x, y));
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.TEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.JACK, x, y));
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.QUEEN, x, y));
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.KING, x, y));
//        deck.add(new Card(game, false, CardsSuit.DIAMONDS, CardsRang.ACE, x, y));

    }

    public LinkedList<Card> getDeck() {

        return deck;

    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub

    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub
        int count = 3;
        for (int i = 0; i < deck.size(); i++) {

            g.drawImage(deck.get(i).faceDoWn(), 80 - count - i, 350, null);
            count++;

        }
    }


}
