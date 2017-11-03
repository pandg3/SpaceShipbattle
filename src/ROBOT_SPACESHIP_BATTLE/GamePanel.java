package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
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
	Timer timer;
	informationBox infoBox;
	//images
	public static BufferedImage oreSign;
	public static BufferedImage rocketImg;

	static int randx = new Random().nextInt(1850);
	static int randy = new Random().nextInt(825);
	
	public GamePanel(Control control) {
		timer = new Timer(1000 / 60, this);
		System.out.println((randx / 50) * 50);
		System.out.println((randy / 50) * 50);
		gameObject = new gameObject();
		this.control = control;
		pl1 = new PL1(150, 50, 50, 50);
		planet1 = new Planet1(50, 50, 50, 50, 1, 10, 50);
		pl2 = new PL2(1650, 800, 50, 50);
		planet2 = new Planet1(1750, 800, 50, 50, 4, 10, 50);
		moveDots = new Movement_Dots(150, 50, 50, 50);
		grid = new Grid(0, 0, 50, 50);
		astroid = new astroidGen((randx / 50) * 50, (randy / 50) * 50, 50, 50, 7);
		infoBox = new informationBox(0, 600, 150, 300);
		try {
			oreSign = ImageIO.read(this.getClass().getResourceAsStream("ORE_SIGN.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("HYPEROCKET0.png"));

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	void startGame() {
		control.startGame(this);
		timer.start();
		
		
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
		
		
		pl1.draw(g);
		planet1.draw(g);
		pl2.draw(g);
		planet2.draw(g);
		grid.draw(g);
		moveDots.draw(g);
		astroid.draw(g);
		gameObject.draw(g);
		infoBox.draw(g);
		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

			gameObject.update();
			pl1.update();
			moveDots.update();
			repaint();
		
	}

}
