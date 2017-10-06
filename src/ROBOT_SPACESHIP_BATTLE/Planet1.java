package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;
import java.awt.Graphics;

public class Planet1 extends gameObject {
	

	public Planet1(int x, int y, int width, int height, int img, int resourceVal, int resourceNodes) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.img = img;
		this.resourceVal = resourceVal;
		this.resourceNodes = resourceNodes;
	}
public void draw(Graphics g) {
	if (img==1) {
		g.setColor(Color.blue.BLUE);
	g.fillRect(x, y, width, height);
	}
	if (img==4) {
		
	}

}
	
}
