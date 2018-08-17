package com.luisrodrigues.cherno.entity.mob;

import com.luisrodrigues.cherno.entity.Entity;
import com.luisrodrigues.cherno.graphics.Sprite;

public abstract class Mob extends Entity {

	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(int xa, int ya) {
		
		//Fixed sliding
		if(xa != 0 && ya != 0) {
			//if we move in 2 axis, we separate movement
			
			move(xa, 0);
			move(0, ya);
			
			return;
		}
		
		/*imagine a compass:
		 * 
		 * 		N
		 * W	x	 E
		 * 		S
		 * */
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
		
		if(!collision(xa, ya)) { 
			x += xa;
			y += ya;
		}
		
	}
	
	public void update() {
		
	}
	
	private boolean collision(int xa, int ya) {
		boolean solid = false;
		
		if(level.getTile((x + xa) / 16, (y + ya) / 16).solid()) { 
			solid = true; 
		}
		
		return solid;
		
	}
	
	public void render() {
		
	}
	
}
