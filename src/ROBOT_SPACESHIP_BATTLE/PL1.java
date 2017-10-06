package ROBOT_SPACESHIP_BATTLE;

import java.awt.Graphics;

public class PL1 extends gameObject {

	public static boolean right = false;
	public static boolean left = false;
	public static boolean up = false;
	public static boolean down = false;

	public PL1(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.img = img;
	}
public void draw(Graphics g) {
		g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
	}

	
	@Override
	void update() {
		// TODO Auto-generated method stub
		/*
		 * if (right){ x+=5; System.out.println("Right"); right = false;
		 * 
		 * } if (left){ x-=5; System.out.println("left"); left = false;
		 * 
		 * } if (up){ y-=5; System.out.println("Up"); up = false;
		 * 
		 * } if (down){ y+=5; System.out.println("Down"); down = false;
		 * 
		 * }
		 */

	}
}
