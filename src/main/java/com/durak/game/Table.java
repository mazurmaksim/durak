package com.durak.game;

import java.awt.image.BufferedImage;

import com.durak.game.gfx.ImageLoader;

public class Table {

	
	private static final int WIDTH = 1300, HEIGHT = 1050; 
	private Deck deck;
	private Player player;
	public static SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/main-back.png"));
	
	public Table() {
		
		
	}
	
	public BufferedImage drawTable() {
		
		return sheet.crop(0, 0, WIDTH, HEIGHT);
		
	}
	
}
