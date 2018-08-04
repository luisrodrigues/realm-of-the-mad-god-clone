package com.luisrodrigues.cherno.graphics;

public class Sprite {
	
	public final int SIZE;
	private int x,y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	//green grass sprite
	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
	//flower sprite
	public static Sprite flower = new Sprite(16, 1, 0, SpriteSheet.tiles);
	//rock sprite
	public static Sprite rock = new Sprite(16, 2, 0, SpriteSheet.tiles);
	//blue sprite
	public static Sprite voidSprite = new Sprite(16, 0x1B87E0);
	
	//player sprites
	public static Sprite player_forward = new Sprite(32, 0, 1, SpriteSheet.tiles);
	public static Sprite player_side = new Sprite(32, 1, 1, SpriteSheet.tiles);
	public static Sprite player_back = new Sprite(32, 2, 1, SpriteSheet.tiles);
	
	public static Sprite player_forward_1 = new Sprite(32, 0, 2, SpriteSheet.tiles);
	public static Sprite player_forward_2 = new Sprite(32, 0, 3, SpriteSheet.tiles);
	
	public static Sprite player_side_1 = new Sprite(32, 1, 2, SpriteSheet.tiles);
	public static Sprite player_side_2 = new Sprite(32, 1, 3, SpriteSheet.tiles);
	
	public static Sprite player_back_1 = new Sprite(32, 2, 2, SpriteSheet.tiles);
	public static Sprite player_back_2 = new Sprite(32, 2, 3, SpriteSheet.tiles);
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		this.x = x * SIZE;
		this.y = y * SIZE;
		this.sheet = sheet;
		load();
	}
	
	public Sprite(int size, int color) {
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		setColor(color);
	}
	
	private void setColor(int color) {
		for(int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = color;
		}
	}
	
	private void load() {
		
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
		
	}
	
}
