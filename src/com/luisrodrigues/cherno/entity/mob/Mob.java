package com.luisrodrigues.cherno.entity.mob;

import com.luisrodrigues.cherno.entity.Entity;
import com.luisrodrigues.cherno.graphics.Sprite;

public abstract class Mob extends Entity{

	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move() {
		
	}
	
	public void update() {
		
	}
	
	private boolean collison() {
		return false;
	}
	
	public void render() {
		
	}
	
}
