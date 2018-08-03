package com.luisrodrigues.cherno.entity.mob;

import com.luisrodrigues.cherno.graphics.Screen;
import com.luisrodrigues.cherno.graphics.Sprite;
import com.luisrodrigues.cherno.input.Keyboard;

public class Player extends Mob {
	
	private Keyboard input;

	private static final int VEL = 10; //player velocity

	public Player(Keyboard input) {
		this.input = input;
	}
	
	public Player(int x, int y, Keyboard input) {
		this.x = x;
		this.y = y;
		this.input = input;
	}
	
	public void update() {
		int xa = 0, ya = 0;
		
		if(input.up) {
			ya -= VEL;
		}
		if(input.down) {
			ya += VEL;
		}
		if(input.left) {
			xa -= VEL;
		}
		if(input.right) {
			xa += VEL;
		}
		
		if(xa != 0 || ya != 0) {
			move(xa, ya);
		}
	}
	
	public void render(Screen screen) {
		screen.renderPlayer(x - 16, y - 16, Sprite.player);
	}
	
}
