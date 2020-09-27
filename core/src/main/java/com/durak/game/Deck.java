package com.durak.game;

import java.util.*;

public class Deck  {

    public LinkedList<Card> deck;

    public Deck() {
        buildCards();
    }

    public int size() {
        return deck.size();
    }

    public LinkedList<Card> buildCards() {
        deck = new LinkedList<Card>();
    // Добавляю карты в колоду.
        for (int i = 0; i < CardsSuit.values().length; i++) {
			for (int j=0;j<CardsRang.values().length;j++){
                deck.add(new Card(false, CardsSuit.values()[i], CardsRang.values()[j]));
            }
        }
    return deck;
    }

    public LinkedList<Card> getDeck() {
        return deck;
    }

  }
