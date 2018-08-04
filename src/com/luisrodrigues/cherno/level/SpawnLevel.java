package com.luisrodrigues.cherno.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.luisrodrigues.cherno.level.tile.Tile;

public class SpawnLevel extends Level {
	
	private Tile[] tiles;
	private int[] levelPixels;

	public SpawnLevel(String path) {
		super(path);
	}
		
	protected void loadLevel(String path) {
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			
			int w = image.getWidth();
			int h = image.getHeight();
			tiles = new Tile[w * h];
			
			image.getRGB(0, 0, w, h, levelPixels, 0 , w);
		
		} catch(IOException e) {
			System.out.print("Could not load level file!");
		}
	}
	
	/* These colors can change
	 * Grass - 0x00ff00 - green
	 * Flower - 0xffff00 - yellow
	 * Rock - 0xff0000 - red
	 * 
	 * */	
	protected void generateLevel() {
		for(int i = 0; i < levelPixels.length; i++) {
			if(levelPixels[i] == 0x00ff00) {
				tiles[i] = Tile.grass;
			} else if(levelPixels[i] == 0xffff00) {
				tiles[i] = Tile.flower;
			} else if(levelPixels[i] == 0xff0000) {
				tiles[i] = Tile.rock;
			}
		}
	}
		
}
