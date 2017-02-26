package ROBOT_SPACESHIP_BATTLE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Timer;

public class Control implements ActionListener, KeyListener, MouseListener {

	PL1 pl1;
	Planet1 planet1;
	gameObject gameObject;
	Timer timer;

	public void actionPerformed(ActionEvent e) {

		gameObject.update();
		pl1.update();
	}

	public Control(GamePanel gPanel) {
		timer = new Timer(1000 / 60, this);
		pl1 = gPanel.getPl1();
		gameObject = gPanel.getGameObject();
	}

	void startGame() {
		timer.start();

	}

	@Override
	public void keyTyped(KeyEvent e) {

		System.out.println("typed");

	}

	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println("Pressed");
		/*
		 * System.out.println(e.getKeyCode()); if (e.getKeyCode() == KeyEvent.VK_RIGHT) { PL1.right = true;
		 * 
		 * } if (e.getKeyCode() == KeyEvent.VK_LEFT) { PL1.left = true;
		 * 
		 * } if (e.getKeyCode() == KeyEvent.VK_UP) { PL1.up = true;
		 * 
		 * } if (e.getKeyCode() == KeyEvent.VK_DOWN) { PL1.down = true;
		 * 
		 * }
		 */
	}

	@Override
	public void keyReleased(KeyEvent e) {

		System.out.println("Released");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Clicked!");

		pl1.x = e.getX();
		pl1.y = e.getY();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
