package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;
import java.awt.Graphics;

public class PL2 extends gameObject {
	public PL2(int x, int y, int width, int height) {
		this.x= x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.orange.ORANGE);
		g.fillRect(x, y, width, height);
	}
}