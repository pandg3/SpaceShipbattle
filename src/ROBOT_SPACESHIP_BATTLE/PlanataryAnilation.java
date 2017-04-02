package ROBOT_SPACESHIP_BATTLE;

import javax.swing.JFrame;

public class PlanataryAnilation {
	static PlanataryAnilation RO;
	static final int gWidth = 1900;
	static final int gHight = 925;

	GamePanel gPanel;
	JFrame main;

	Control control;

	public static void main(String[] args) {
		PlanataryAnilation RO = new PlanataryAnilation();
		RO.setup();
	}

	public PlanataryAnilation() {
		main = new JFrame();

		gPanel = new GamePanel();
		control = new Control(gPanel);
		setup();
	}

	void setup() {
		main.addKeyListener(control);
		main.addMouseListener(control);
		main.add(gPanel);
		main.setVisible(true);

		main.setSize(gWidth, gHight);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		control.startGame();

	}
}