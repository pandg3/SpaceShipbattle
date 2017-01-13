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
		
		
		
	}
	void draw(Graphics g){
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);

	}
}
