package com.luisrodrigues.cherno.graphics;

public class Screen {
	
	private int width, height;
	public int[] pixels;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width*height];
	}
	
	public void clear() {
		for(int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render() {
				
		for(int y = 0; y < height; y++) {
			if(y < 0 || y >= height) {
				break;
			}
			for(int x = 0; x < width; x++) {
				if(x < 0 || x >= width) {
					break;
				}
				//Se for hexadecimal pomos prefixo 0x antes do código, 0b se for binário (não é case sensitive)
				pixels[x + y * width] = 0xFF00FF;
			}
		}
	}
	
}
