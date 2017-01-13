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

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer timer;
	gameObject gameObject;
	PL1 pl1;
	public static BufferedImage rocketImg;
	public GamePanel() {
		gameObject = new gameObject();
		timer = new Timer(1000/60, this);
		pl1 = new PL1(50, 50,50, 50);
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
public void paintComponent(Graphics g){
	           
	gameObject.draw(g);
	pl1.draw(g);
	repaint();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		gameObject.update();
		pl1.update();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("typed");
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
		System.out.println(e.getKeyCode());
		if (e.getKeyCode()== KeyEvent.VK_RIGHT){
			PL1.right= true;
		
		}
		if (e.getKeyCode()== KeyEvent.VK_LEFT){
			PL1.left= true;
		
		}
		if (e.getKeyCode()== KeyEvent.VK_UP){
			PL1.up= true;
		
		}
		if (e.getKeyCode()== KeyEvent.VK_DOWN){
			PL1.down= true;
		
		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Released");
	}
	

}
