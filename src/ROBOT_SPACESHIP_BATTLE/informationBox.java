package ROBOT_SPACESHIP_BATTLE;

import java.awt.Graphics;

import javax.swing.plaf.synth.SynthSpinnerUI;
	
public class informationBox extends gameObject {
	public informationBox(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void draw(Graphics g){
		if (manager.isInfoVisable == 1){
			g.fillRect(x, y, width, height);
		}
		System.out.println(manager.isInfoVisable);
	}
}
