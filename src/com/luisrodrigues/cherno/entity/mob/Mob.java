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
	
	protected void shoot(int x, int y, double dir) {
		dir *= 180 / Math.PI;
		System.out.println("Angle: " + dir);
	}
	
	private boolean collision(int xa, int ya) {
		boolean solid = false;
		
		for (int c = 0; c < 4; c++) {
			//collideable area, check for corners
			int xt = ((x + xa) + c % 2 * 14 - 8) / 16;
			int yt = ((y + ya) + c / 2 * 12 + 3) / 16;
			
			if(level.getTile(xt, yt).solid()) { 
				solid = true; 
			}
			
		}
		
		return solid;
		
	}
	
	public void render() {
		
	}
	
}
