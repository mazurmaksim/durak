package com.durak.game.entities.creatures;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.durak.game.Card;
import com.durak.game.Deck;
import com.durak.game.Game;

public class Player extends Creature {

    public static final float CARD_UPLIFT = 50f;

    private final List<Card> cards = new ArrayList<>();
    private final List<Card> selectedCards = new ArrayList<>();

    private final String name;
    private final Deck deck;
    private final Game game;

    private boolean faceup;

    // Index of currently highlighted card in hand
    private int cursorIndex = 0;

    // Used to avoid selecting too fast when holding key
    private long nextMoveAllowedAtMs = 0L;
    private static final long MOVE_COOLDOWN_MS = 180L;

    public Player(Game game, String name, Deck deck, boolean faceup, float x, float y) {
        super(x, y);
        this.name = name;
        this.deck = deck;
        this.game = game;
        this.faceup = faceup;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public List<Card> getSelectedCards() {
        return selectedCards;
    }

    public void putCard(Card card) {
        card.setX(x);
        card.setY(y);
        cards.add(card);
        // Keep cursor valid
        clampCursor();
    }

    // Select the currently highlighted card (move it to selectedCards)
    private void selectCurrentCard() {
        if (cards.isEmpty()) return;

        clampCursor();
        Card picked = cards.remove(cursorIndex);
        selectedCards.add(picked);

        // Place selected cards on the table line (example Y = 350)
        for (Card c : selectedCards) {
            c.setY(350);
        }

        // After removal, cursor might point past end
        clampCursor();
    }

    private void clampCursor() {
        if (cards.isEmpty()) {
            cursorIndex = 0;
            return;
        }
        if (cursorIndex < 0) cursorIndex = 0;
        if (cursorIndex >= cards.size()) cursorIndex = cards.size() - 1;
    }

    @Override
    public void tick() {
        long now = System.currentTimeMillis();

        // Highlight logic
        // Reset all cards to base Y
        for (Card c : cards) {
            c.setY(y);
        }

        if (!cards.isEmpty()) {
            clampCursor();
            cards.get(cursorIndex).setY(y - CARD_UPLIFT);
        }

        // Move cursor right with cooldown
        if (game.getKeyManager().right && now >= nextMoveAllowedAtMs) {
            if (!cards.isEmpty()) {
                cursorIndex++;
                if (cursorIndex >= cards.size()) cursorIndex = 0;
                nextMoveAllowedAtMs = now + MOVE_COOLDOWN_MS;
            }
        }

        // Confirm selection
        if (game.getKeyManager().enter) {
            selectCurrentCard();
        }
    }

    @Override
    public void render(Graphics g) {
        float playerXcoord = 30;

        for (int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);
            c.setFace_up(faceup);
            c.setX(playerXcoord + x);
            c.render(g);
            playerXcoord += 30;
        }
    }

    public void setFaceup(boolean faceup) {
        this.faceup = faceup;
    }
}
