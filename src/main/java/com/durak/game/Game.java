package com.durak.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import com.durak.game.gfx.ImageLoader;

public class Game implements Runnable {
	private Display display;
	public int width, height;
	public String title;

	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	public Game(String title, int width, int height) {

		this.width = width;
		this.height = height;
		this.title = title;

	}

	private void init() {
		display = new Display(title, width, height);
		Deck deck = new Deck();
		Deck.buildCards();
		Dealer dlr = new Dealer(deck);
		dlr.shuffleDeck();
		dlr.getTrump();

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

		g.drawImage(Deck.getDeck().get(0).getSheet(), 10, 50, null);
		g.drawImage(Deck.getDeck().get(1).getSheet(), 100, 50, null);
		g.drawImage(Deck.getDeck().get(2).getSheet(), 190, 50, null);
		g.drawImage(Deck.getDeck().get(3).getSheet(), 280, 50, null);
		g.drawImage(Deck.getDeck().get(4).getSheet(), 370, 50, null);
		g.drawImage(Deck.getDeck().get(5).getSheet(), 460, 50, null);
		g.drawImage(Deck.getDeck().get(6).getSheet(), 550, 50, null);
		g.drawImage(Deck.getDeck().get(7).getSheet(), 640, 50, null);
		g.drawImage(Deck.getDeck().get(8).getSheet(), 730, 50, null);

		
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
