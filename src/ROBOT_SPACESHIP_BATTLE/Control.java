package ROBOT_SPACESHIP_BATTLE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Timer;

public class Control implements KeyListener, MouseListener {
	Movement_Dots moveDots;
	PL1 pl1;
	Planet1 planet1;
	gameObject gameObject;
	Timer timer;
	int mouseX;
	int mouseY;
	static ObjectManager objMan = new ObjectManager();
	
	void startGame(GamePanel gPanel) {
		
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
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
mouseX = e.getX();
		mouseY = e.getY();
		System.out.println("Click X = " + e.getX() + " Click Y = " + e.getY());
		System.out.println("RandomX = " + GamePanel.randx + " RandomY = " + GamePanel.randy);
		System.out.println(objMan.getPl1Miners());
		
		if (e.getX() > (GamePanel.randx / 50) * 50 && e.getX() < ((GamePanel.randx / 50) * 50) + 50
			&& e.getY() > (GamePanel.randy / 50) * 50 && e.getY() < ((GamePanel.randy / 50) * 50) + 50) 
		{
				gameObject.manager.setInfoVisable(1);
				System.out.println(gameObject.manager.getInfoVisable());
				
				/*if (objMan.getMinerCost()<objMan.getPl1minerals()) 
				{
					objMan.setPl1minerals(objMan.getPl1minerals()-objMan.getMinerCost());
					objMan.setPl1Miners(objMan.getPl1Miners()+1);
					System.out.println(objMan.getPl1Miners());	
				}*/
			
			
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
