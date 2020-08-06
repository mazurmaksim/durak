package com.durak.game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.durak.game.input.KeyManager;
import com.durak.game.input.MauseManager;
import com.durak.game.states.GameState;
import com.durak.game.states.State;

public class Game implements Runnable {
	private Display display;
	public int width, height;
	public String title;

	private boolean running = false;
	private Thread thread;

	private BufferStrategy bs;
	private Graphics g;

	// States
	private State gameState;
	private State menuState;
	private GameState toplayers;
	
	//Input
	private MauseManager mouseManager;
	private KeyManager keyManager;
	
	public Game(String title, int width, int height) {

		this.width = width;
		this.height = height;
		this.title = title;
		mouseManager = new MauseManager();
		keyManager = new KeyManager();

	}

	
	private void init() {
		display = new Display(title, width, height);
		
		display.getFrame().addKeyListener(keyManager);
		
		
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
//		System.out.println(deck.size());

		gameState = new GameState(this);
		menuState = new GameState(this);
		toplayers = (GameState)gameState;
		
		State.setState(gameState);
	}

	private void tick() {
		keyManager.tick();
		if(State.getState() !=null) {
			State.getState().tick();
		}
		
	}

	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// Draw Here

		if(State.getState() !=null) {
			State.getState().render(g);
		}
		
		// End Draw
		bs.show();
		g.dispose();

	}

	public void run() {
		init();

		while (running) {
			tick();
			render();

		}
		stop();
	}

	public synchronized void start() {
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if (!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public GameState getGamestate() {
		
		return toplayers;
	}

	
	public MauseManager getMauseManager() {
		
		return mouseManager;
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
	}
	

}
