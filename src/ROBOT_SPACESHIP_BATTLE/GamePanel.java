package ROBOT_SPACESHIP_BATTLE;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState;

	gameObject gameObject;
	PL1 pl1;
	Planet1 planet1;
	PL2 pl2;
	Planet2 planet2;
	GamePanel gamepanel;
	Grid grid;
	public static BufferedImage rocketImg;

	public GamePanel() {

		gameObject = new gameObject();

		pl1 = new PL1(110, 50, 50, 50, 1);
		planet1 = new Planet1(50, 50, 50, 50, 2);
		pl2 = new PL2(1660, 800, 50, 50, 3);
		planet2 = new Planet2(1760, 800, 50, 50, 4);

		grid = new Grid(0, 0, 50, 50, 5);

		try {

			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("HYPEROCKET0.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		repaint();

	}

}
