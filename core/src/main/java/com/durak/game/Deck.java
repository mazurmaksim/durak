package com.durak.game;

import java.util.*;

public class Deck  {

    public LinkedList<Card> deck;

    Deck() {

    }

    public int size() {
        return deck.size();
    }

    public void buildCards() {
        deck = new LinkedList<Card>();
    // Добавляю карты в колоду.
        for (int i = 0; i < CardsSuit.values().length; i++) {
			for (int j=0;j<CardsRang.values().length;j++){
                deck.add(new Card(false, CardsSuit.values()[i], CardsRang.values()[j]));
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

  }
