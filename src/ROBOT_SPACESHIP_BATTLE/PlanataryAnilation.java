package ROBOT_SPACESHIP_BATTLE;

import javax.swing.JFrame;

public class PlanataryAnilation {
	static PlanataryAnilation RO;
	static final int gWidth = 1910;
	static final int gHight = 950;
	GamePanel gPanel;
	JFrame main;
	Gui gui = new Gui();

	public static void main(String[] args) {
		PlanataryAnilation RO = new PlanataryAnilation();
		RO.setup();
	}

	public PlanataryAnilation() {
		main = new JFrame();

		gPanel = new GamePanel();
		setup();
	}

	void setup() {
		main.addKeyListener(gPanel);
		main.add(gPanel);
		main.setVisible(true);
		gui.menu.setVisible(true);
		main.add(gui.menu);
		main.setSize(gWidth, gHight);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gPanel.startGame();

	}
}