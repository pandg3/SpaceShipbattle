package ROBOT_SPACESHIP_BATTLE;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState;
	Timer timer;

	gameObject gameObject;
	PL1 pl1;
	Planet1 planet1;
	PL2 pl2;
	Planet2 planet2;
	GamePanel gamepanel;
	public static BufferedImage rocketImg;

	public GamePanel() {

		gameObject = new gameObject();
		timer = new Timer(1000 / 60, this);
		pl1 = new PL1(110, 50, 50, 50, 1);
		planet1 = new Planet1(50, 50, 50, 50, 2);
		pl2 = new PL2(1660, 800, 50, 50, 3);
		planet2 = new Planet2(1760, 800, 50, 50, 4);

		try {

			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("HYPEROCKET0.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void startGame() {
		timer.start();

	}

	public void paintComponent(Graphics g) {

		gameObject.draw(g);
		pl1.draw(g);
		planet1.draw(g);
		pl2.draw(g);
		planet2.draw(g);
		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		gameObject.update();
		pl1.update();
	}

	@Override
	public void keyTyped(KeyEvent e) {

		System.out.println("typed");

	}

	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println("Pressed");
		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			PL1.right = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			PL1.left = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			PL1.up = true;

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			PL1.down = true;

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		System.out.println("Released");
	}

}
