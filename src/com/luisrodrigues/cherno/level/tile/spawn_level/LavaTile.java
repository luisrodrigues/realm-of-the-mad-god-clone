package com.luisrodrigues.cherno.level.tile.spawn_level;

import com.luisrodrigues.cherno.graphics.Screen;
import com.luisrodrigues.cherno.graphics.Sprite;
import com.luisrodrigues.cherno.level.tile.Tile;

public class LavaTile extends Tile {

	public LavaTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
