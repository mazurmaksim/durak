package com.durak.game;

public enum CardsSuit {
    DIAMONDS(4),
    HEARTS(3),
    SPADES(6),
    CLUBS(5);

    private int suit;

    CardsSuit(int suit){
        this.suit=suit;
    }

    public  int getSuit(){
        return suit;
    }
}
