package ROBOT_SPACESHIP_BATTLE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Timer;

public class Control implements ActionListener, KeyListener, MouseListener {
	Movement_Dots moveDots;
	PL1 pl1;
	Planet1 planet1;
	gameObject gameObject;
	Timer timer;
	int mouseX;
	int mouseY;
	static ObjectManager objMan = new ObjectManager();
	public void actionPerformed(ActionEvent e) {

		gameObject.update();
		pl1.update();
		moveDots.update();
	}

	public Control() {
		timer = new Timer(1000 / 60, this);
	}

	void startGame(GamePanel gPanel) {
		timer.start();
		pl1 = gPanel.getPl1();
		gameObject = gPanel.getGameObject();
		moveDots = gPanel.getmoveDots();

	}

	@Override
	public void keyTyped(KeyEvent e) {

		System.out.println("typed");

	}

	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println("Pressed");
		/*
		 * System.out.println(e.getKeyCode()); if (e.getKeyCode() ==
		 * KeyEvent.VK_RIGHT) { PL1.right = true;
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

	public int getmouseX() {
		return mouseX;
	}

	@Override
	public void keyReleased(KeyEvent e) {

		System.out.println("Released");
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 5; i++) {
			// System.out.println(gameObject.xcords.get(i));
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
System.out.println("hyjhyjyj");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
mouseX = e.getX();
		mouseY = e.getY();
		System.out.println("Click X = " + e.getX() + " Click Y = " + e.getY());
		System.out.println("RandomX = " + GamePanel.randx + " RandomY = " + GamePanel.randy);
		System.out.println(objMan.getMiners());
		if (e.getX() > (GamePanel.randx / 50) * 50 && e.getX() < ((GamePanel.randx / 50) * 50) + 50
				&& e.getY() > (GamePanel.randy / 50) * 50 && e.getY() < ((GamePanel.randy / 50) * 50) + 50) {
			System.out.println("AstroidClick");
			objMan.setMiners(objMan.getMiners()+1);
			System.out.println(objMan.getMiners());
		}
		if (e.getX()<pl1.x+250 && e.getX()>pl1.x-250){
			if (e.getY()<pl1.y+250&& e.getY()>pl1.y-250){
				pl1.x = (e.getX() / 50) * 50;
				pl1.y = (e.getY() / 50) * 50;
				moveDots.x = (e.getX() / 50) * 50;
				moveDots.y = (e.getY() / 50) * 50;
			}
		}
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
