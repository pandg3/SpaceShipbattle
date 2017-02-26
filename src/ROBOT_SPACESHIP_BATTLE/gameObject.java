package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;
import java.awt.Graphics;

public class gameObject {
	int x;
	int y;
	int width;
	int height;
	int img;
	int xG = 0;

	public gameObject() {

	}

	void update() {

	}

	void draw(Graphics g) {
		if (img == 1) {
			g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
		} else if (img == 2) {
			g.setColor(Color.blue.BLUE);
			g.fillRect(x, y, width, height);

		} else if (img == 3) {
			g.setColor(Color.orange.ORANGE);
			g.fillRect(x, y, width, height);
		} else if (img == 4) {
			g.setColor(Color.red.RED);
			g.fillRect(x, y, width, height);
		} else if (img == 5) {
			g.setColor(Color.black.BLACK);
			for (int i = 0; i < 20; i++) {
				g.drawRect(xG, 0, 50, 50);
				xG += 50;
			}

		}

	}
}
