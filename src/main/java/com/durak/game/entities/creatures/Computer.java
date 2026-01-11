package com.durak.game.entities.creatures;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.Game;

public class Computer extends Player {

    private final Game game;

    public Computer(Game game, String name, Deck deck, boolean faceup, float x, float y) {
        super(game, name, deck, faceup, x, y);
        this.game = game;
    }

    @Override
    public void tick() {
        // Example debug toggle to show computer cards
        if (game.getKeyManager().f_nine) {
            setFaceup(true);
        }
    }

    /**
     * Choose a card to beat the opponent's card.
     * - Prefer same suit with minimal rank that still beats.
     * - Otherwise, use minimal trump if opponent is not trump.
     * - Return null if cannot beat.
     */
    public Card chooseDefenseCard(Card opponentCard) {
        List<Card> hand = getCards();
        if (hand.isEmpty()) return null;

        int trumpSuit = game.getGamestate().getDealer().getTrump().getSuit();

        Card bestSameSuit = null;
        Card bestTrump = null;

        for (Card c : hand) {
            // Same suit: choose the minimal rank that still beats
            if (c.getSuit() == opponentCard.getSuit() && c.getRang() > opponentCard.getRang()) {
                if (bestSameSuit == null || c.getRang() < bestSameSuit.getRang()) {
                    bestSameSuit = c;
                }
            }

            // Trump: if opponent isn't trump, pick minimal trump
            if (opponentCard.getSuit() != trumpSuit && c.getSuit() == trumpSuit) {
                if (bestTrump == null || c.getRang() < bestTrump.getRang()) {
                    bestTrump = c;
                }
            }
        }

        return (bestSameSuit != null) ? bestSameSuit : bestTrump;
    }

    @Override
    public void render(Graphics g) {
        // Use Player's render (unless you want a different layout)
        super.render(g);
    }
}
