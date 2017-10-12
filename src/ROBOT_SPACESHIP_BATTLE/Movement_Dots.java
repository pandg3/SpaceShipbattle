package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;
import java.awt.Graphics;

public class Movement_Dots extends gameObject {
	public Movement_Dots(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.img = img;

	}
public void draw(Graphics g) {
	g.setColor(Color.blue.brighter());
	for (int k = 0; k < 5; k++) {
		g.drawOval(xM, y, width, height);
		
		int xM1 = k * 50;
		xM = x + xM1;

	}
	for (int l = 0; l < 5; l++) {
		g.drawOval(x, yM, width, height);
		int yM1 = l * 50;
		yM = y + yM1;
	}
	for (int m = 0; m < 5; m++) {
		g.drawOval(xM, yM, width, height);
		int xM1 = m * 50;
		int yM1 = m * 50;
		xM = x + xM1;
		yM = y + yM1;
	}
	}
}
