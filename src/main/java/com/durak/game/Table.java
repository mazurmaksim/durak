package com.durak.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.durak.game.entities.Entity;
import com.durak.game.entities.creatures.Player;
import com.durak.game.gfx.ImageLoader;

public class Table extends Entity{

	
	private static final int WIDTH = 1300, HEIGHT = 1050; 
	private Deck deck;
	private Player player;
	float x,y;
	public static SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/main-back.png"));
	
	public Table(float x, float y) {
		super(x,y);
		
	}
	
	public BufferedImage drawTable() {
		
		return sheet.crop(0, 0, WIDTH, HEIGHT);
		
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(drawTable(),(int)x,(int)y, null);
	}
	
}
