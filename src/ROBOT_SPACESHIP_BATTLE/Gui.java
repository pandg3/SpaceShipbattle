package ROBOT_SPACESHIP_BATTLE;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Gui extends GamePanel {
	JPanel menu = new JPanel();
	JButton Start = new JButton();

	public Gui() {
		menu.add(Start);
		menu.setBounds(755, 0, 200, 950);
		Start.setBounds(955, 400, 100, 50);
		menu.setBackground(Color.BLUE.blue);

	}
}
