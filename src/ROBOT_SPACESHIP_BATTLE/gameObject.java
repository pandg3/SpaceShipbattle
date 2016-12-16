package ROBOT_SPACESHIP_BATTLE;

import java.awt.Graphics;

public class gameObject {
	int x;
	int y;
	int width;
	int height;
	public gameObject() {
	
	}
	
	void update(){
		x+=50;
		
		
	}
	void draw(Graphics g){
		g.fillRect(x, y, 100, 100);
	}
}
