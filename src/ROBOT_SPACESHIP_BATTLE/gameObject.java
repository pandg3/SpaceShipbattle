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
	int yG = 0;
	int xM;
	int yM;

	public gameObject() {

	}

	void update() {

	}

	void draw(Graphics g) {
		if (img == 1) {
			g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
			// g.setColor(Color.green.GREEN);
			// g.fillRect(x, y, width, height);
		} else if (img == 2) {
			g.setColor(Color.blue.BLUE);
			g.fillRect(x, y, width, height);

		} else if (img == 3) {
			g.setColor(Color.orange.ORANGE);
			g.fillRect(x, y, width, height);
		} else if (img == 4) {
			g.setColor(Color.red.RED);
			g.fillRect(x, y, width, height);
		}

		else if (img == 5) {
			g.setColor(Color.black.BLACK);

			for (int j = 0; j < 18; j++) {
				yG = j * 50;

				for (int i = 0; i < 38; i++) {
					g.drawRect(xG, yG, 50, 50);
					xG += 50;
				}
				xG = 0;
			}

		} else if (img == 6) {
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

		} else if (img == 7) {
			g.setColor(Color.YELLOW);
			g.fillRect(x, y, width, height);
		}
		else if (img == 8){
			g.setColor(Color.GRAY);
			g.fillRect(x, y, width, height);
		}
	}

}
