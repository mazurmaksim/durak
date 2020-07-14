package com.durak.game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game implements Runnable {
	private Display display;
	public int width, height;
	public String title;

	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private Player player;
	private Player comp;
	private Dealer dlr;
	private Card trump;
	
	public Game(String title, int width, int height) {

		this.width = width;
		this.height = height;
		this.title = title;

	}

	private void init() {
		display = new Display(title, width, height);
		Deck deck = new Deck();
		deck.buildCards();
		player = new Player("Maks");
		comp = new Player("Computer");
		dlr = new Dealer(deck);
		dlr.shuffleDeck();
		dlr.dealCards(comp);
		dlr.dealCards(player);
		trump = dlr.trumpCard();
		System.out.println(deck.size());
	}
	
	private void tick() {}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// Draw Here
		
		//Player 1 cards
		g.drawImage(player.getCards().get(0).faceUp(), 730-50, 700, null);
		g.drawImage(player.getCards().get(1).faceUp(), 760-50, 700, null);
		g.drawImage(player.getCards().get(2).faceUp(), 790-50, 700, null);
		g.drawImage(player.getCards().get(3).faceUp(), 820-50, 700, null);
		g.drawImage(player.getCards().get(4).faceUp(), 850-50, 700, null);
		g.drawImage(player.getCards().get(5).faceUp(), 880-50, 700, null);

		//Player 2 Cards
		g.drawImage(comp.getCards().get(0).faceDoWn(), 730-50, 10, null);
		g.drawImage(comp.getCards().get(1).faceDoWn(), 760-50, 10, null);
		g.drawImage(comp.getCards().get(2).faceDoWn(), 790-50, 10, null);
		g.drawImage(comp.getCards().get(3).faceDoWn(), 820-50, 10, null);
		g.drawImage(comp.getCards().get(4).faceDoWn(), 850-50, 10, null);
		g.drawImage(comp.getCards().get(5).faceDoWn(), 880-50, 10, null);
		
		//Trump card
		g.drawImage(trump.faceUp(), 10, 350, null);
		
		
		//End Draw
		bs.show();
		g.dispose();
		
	}
	
	public void run() {
		init();
		
		while(running){
			tick();
			render();
			
		}
		stop();
	}

	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}

	public synchronized void stop() {
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
