package com.durak.game;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Display {
	// https://www.youtube.com/watch?v=lf9awz6j88Q&list=PLah6faXAgguMnTBs3JnEJY0shAc18XYQZ&index=2
	private JFrame frame;
	private Canvas canvas;

	private int width, height;
	private String title;

	public Display(String title, int width, int height) {

		this.title = title;
		this.width = width;
		this.height = height;

		createDisplay();

	}

	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);

		frame.add(canvas);
		frame.pack();
	}

	public Canvas getCanvas() {

		return canvas;
	}

	public JFrame getFrame() {
		return frame;

	}

}
