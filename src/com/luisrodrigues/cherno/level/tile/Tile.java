package com.luisrodrigues.cherno.level.tile;

import com.luisrodrigues.cherno.graphics.Screen;
import com.luisrodrigues.cherno.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flower = new FlowerTile(Sprite.flower);
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile stone = new StoneTile(Sprite.stone);
	public static Tile water = new WaterTile(Sprite.water);
	public static Tile lava = new LavaTile(Sprite.lava);
	public static Tile wood = new WoodTile(Sprite.wood);
	
	//green
	public static final int col_grass = 0xff00ff00;
	//yellow
	public static final int col_stone = 0xffffff00;
	//red
	public static final int col_wood = 0xffff0000;
	
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		
	}
	
	//Collisions - by default it doens't collide
	public boolean solid() {
		return false;
	}
	
}
