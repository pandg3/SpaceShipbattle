package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;
import java.awt.Graphics;

public class Grid extends gameObject {
	public Grid(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.img = img;
	}
	public void draw(Graphics g) {
		g.setColor(Color.black.BLACK);

		for (int j = 0; j < 18; j++) {
			yG = j * 50;

			for (int i = 0; i < 38; i++) {
				g.drawRect(xG, yG, 50, 50);
				xG += 50;
			}
			xG = 0;
		}
	}
}
