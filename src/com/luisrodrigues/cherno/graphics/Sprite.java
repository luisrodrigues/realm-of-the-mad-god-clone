package com.luisrodrigues.cherno.graphics;

public class Sprite {
	
	private final int SIZE;
	private int x,y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	//falta criar a SpriteSheet com todas as Sprites
	
	//green grass sprite
	public static Sprite grass = new Sprite(16, 0, 0, null);
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * SIZE;
		this.y = y * SIZE;
		this.sheet = sheet;
		load();
	}
	
	private void load() {
		
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
		
	}
	
}
