package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;
import java.awt.Graphics;

public class astroidGen extends gameObject {

	public astroidGen(int x, int y, int width, int height, int img) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.img = img;
	}
	public void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
		g.setColor(Color.gray);
		g.fillRect(x, y, width, height);
	}
}
