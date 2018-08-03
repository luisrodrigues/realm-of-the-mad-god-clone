package com.luisrodrigues.cherno.entity.mob;

import com.luisrodrigues.cherno.graphics.Screen;
import com.luisrodrigues.cherno.graphics.Sprite;
import com.luisrodrigues.cherno.input.Keyboard;

public class Player extends Mob {
	
	private Keyboard input;

	private static final int VEL = 3; //player velocity

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
		int flip = 0;
		switch(dir) {
			case 0: sprite = Sprite.player_forward;
					break;
			case 1: sprite = Sprite.player_side;
					break;
			case 2: sprite = Sprite.player_back;
					break;
			case 3: sprite = Sprite.player_side;
					flip = 1;
					break;
			default: sprite = Sprite.player_back;
					break;
		}
		
		screen.renderPlayer(x - 16, y - 16, sprite, flip);
	}
	
}
