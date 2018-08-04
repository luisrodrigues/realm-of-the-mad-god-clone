package com.luisrodrigues.cherno.entity.mob;

import com.luisrodrigues.cherno.graphics.Screen;
import com.luisrodrigues.cherno.graphics.Sprite;
import com.luisrodrigues.cherno.input.Keyboard;

public class Player extends Mob {
	
	private Keyboard input;
	private int anim = 0;
	private boolean walking = false;

	private static final int VEL = 3; //player velocity: extra credit

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
		
		if(anim < 7500) {
			anim++;
		} else {
			anim = 0;
		}
		
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
			walking = true;
		} else {
			walking = false;
		}
	}
	
	public void render(Screen screen) {
		int flip = 0;
		switch(dir) {
			case 0: sprite = Sprite.player_forward;
					if(walking) {
						//half of the time it renders one sprite, then: the other
						if(anim % 20 > 10) {
							sprite = Sprite.player_forward_1;
						} else {
							sprite = Sprite.player_forward_2;
						}
					}
					break;
			case 1: sprite = Sprite.player_side;
					if(walking) {
						if(anim % 20 > 10) {
							sprite = Sprite.player_side_1;
						} else {
							sprite = Sprite.player_side_2;
						}
					}
					break;
			case 2: sprite = Sprite.player_back;
					if(walking) {
						if(anim % 20 > 10) {
							sprite = Sprite.player_back_1;
						} else {
							sprite = Sprite.player_back_2;
						}
					}
					break;
			case 3: sprite = Sprite.player_side;
					flip = 1;
					if(walking) {
						if(anim % 20 > 10) {
							sprite = Sprite.player_side_1;
						} else {
							sprite = Sprite.player_side_2;
						}
					}
					break;
			default: sprite = Sprite.player_back;
					break;
		}
		
		screen.renderPlayer(x - 16, y - 16, sprite, flip);
	}
	
}
