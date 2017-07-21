package ROBOT_SPACESHIP_BATTLE;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 5;
	int currentState;
	Control control;
	gameObject gameObject;
	PL1 pl1;
	Planet1 planet1;
	PL2 pl2;
	Planet1 planet2;
	GamePanel gamepanel;
	Grid grid;
	Movement_Dots moveDots;
	astroidGen astroid;
	
	public static BufferedImage rocketImg;

	static int randx = new Random().nextInt(1850);
	static int randy = new Random().nextInt(825);

	public GamePanel(Control control) {
		
		System.out.println((randx / 50) * 50);
		System.out.println((randy / 50) * 50);
		gameObject = new gameObject();
		this.control = control;
		pl1 = new PL1(150, 50, 50, 50, 1);
		planet1 = new Planet1(50, 50, 50, 50, 2, 10, 50);
		pl2 = new PL2(1650, 800, 50, 50, 3);
		planet2 = new Planet1(1750, 800, 50, 50, 4, 10, 50);
		moveDots = new Movement_Dots(150, 50, 50, 50, 6);
		grid = new Grid(0, 0, 50, 50, 5);
		astroid = new astroidGen((randx / 50) * 50, (randy / 50) * 50, 50, 50, 7);
		
		try {

			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("HYPEROCKET0.png"));

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public Movement_Dots getmoveDots() {
		return moveDots;
	}

	public PL1 getPl1() {
		return pl1;
	}

	public gameObject getGameObject() {
		return gameObject;
	}

	public void paintComponent(Graphics g) {
		
		gameObject.draw(g);
		pl1.draw(g);
		planet1.draw(g);
		pl2.draw(g);
		planet2.draw(g);
		grid.draw(g);
		moveDots.draw(g);
		astroid.draw(g);
		
		repaint();

	}

}
