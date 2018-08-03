package com.luisrodrigues.cherno.entity.mob;

import com.luisrodrigues.cherno.entity.Entity;
import com.luisrodrigues.cherno.graphics.Sprite;

public abstract class Mob extends Entity {

	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(int xa, int ya) {
		//imagine a compass
		if(xa > 0) {
			dir = 1; //east
		}
		
		if(xa < 0) {
			dir = 3; //west
		}
		
		if(ya > 0) {
			dir = 2; //south
		}
		
		if(ya < 0) {
			dir = 0; //north
		}
		
		if(!collision()) {
			x += xa; 
			y += ya; 
		}
	}
	
	public void update() {
		
	}
	
	private boolean collision() {
		return false;
	}
	
	public void render() {
		
	}
	
}
