package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class gameObject {
	boolean isAlive = true;
	int x;
	int y;
	int width;
	int height;
	int img;
	int xG = 0;
	int yG = 0;
	int xM;
	int yM;
	int resourceVal;
	int resourceNodes;
	int usedResourceNodes;
	double totalResources;
	int totalResourcesRounded;
	Rectangle collisionBox;
	ObjectManager manager = new ObjectManager();
	public gameObject() {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		collisionBox = new Rectangle(x, y, width, height);
	}

	// public ArrayList<Integer> getarray() {
	// return xcords;
	// }

	void update() {
		totalResources =totalResources+Control.objMan.getPl1Miners() *0.02;
//		System.out.println(totalResources);
		totalResourcesRounded= (int) Math.round(totalResources);
	}
	void draw(Graphics g) {
		g.drawImage(GamePanel.oreSign, 150, 0, 125, 75, null);
		g.setColor(Color.BLUE);
		g.drawString("miners: " + Integer.toString(Control.objMan.getPl1Miners()), 40, 50);
		g.drawString("Minerals: "+ totalResourcesRounded, 165, 45);
		
	}

}
