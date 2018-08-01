package com.luisrodrigues.cherno.entity;

import java.util.Random;

import com.luisrodrigues.cherno.graphics.Screen;
import com.luisrodrigues.cherno.level.Level;

public class Entity {
	
	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update() {
		
	}
	
	public void render(Screen screen) {
			
	}
	
	public void remove() {
		//remover entidade num Level
		removed = true;
	}
	
	public boolean isRemoved() {
		return removed;
	}
	
}
