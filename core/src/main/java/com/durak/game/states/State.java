package com.durak.game.states;

import java.awt.Graphics;

import com.durak.game.Game;

public abstract class State {

	private static State currenState = null;
	protected Game game;
	
	public static void setState(State state) {
		currenState = state;

	}

	public static State getState() {

		return currenState;

	}

	public State(Game game) {
		this.game = game;
	}

	public abstract void tick();

	public abstract void render(Graphics g);
}
