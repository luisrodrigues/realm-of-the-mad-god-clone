package com.luisrodrigues.cherno.level.tile;

import com.luisrodrigues.cherno.graphics.Screen;
import com.luisrodrigues.cherno.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
		
	}
	
	public boolean solid() {
		return false;
	}
	
}
