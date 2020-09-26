package com.durak.game;

public enum CardsRang {
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int rang;

    CardsRang(int rang){
        this.rang = rang;
    }

    public int getRang(){
        return rang;
    }
}
