package ROBOT_SPACESHIP_BATTLE;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	ArrayList<gameObject> objects;

	private int miners = 0;

	long enemyTimer = 0;
	int enemySpawnTime = 1000;

	public ObjectManager() {
		objects = new ArrayList<gameObject>();
	}

	public void addObject(gameObject o) {
		objects.add(o);
	}

	public void update() {
		for (int i = 0; i < objects.size(); i++) {
			gameObject o = objects.get(i);
			o.update();
		}

		purgeObjects();
	}

	public void draw(Graphics g) {
		for (int i = 0; i < objects.size(); i++) {
			gameObject o = objects.get(i);
			o.draw(g);
		}
	}

	private void purgeObjects() {
		for (int i = 0; i < objects.size(); i++) {
			if (!objects.get(i).isAlive) {
				objects.remove(i);
			}
		}
	}

//	public void manageEnemies() {
//		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
//			addObject(new aliens(new Random().nextInt(Leauge_Invaders.gWidth), 0, 50, 50));
//			enemyTimer = System.currentTimeMillis();
//		}
//	}
//	public void checkCollision() {
//	 for (int i = 0; i < objects.size(); i++) {
//	 for (int j = i + 1; j < objects.size(); j++) {
//	 GameObject o1 = objects.get(i);
//	 GameObject o2 = objects.get(j);
//	
//	 if(o1.collisionBox.intersects(o2.collisionBox)){
//	 if((o1 instanceof aliens && o2 instanceof Projectile) ||
//	 (o2 instanceof aliens && o1 instanceof Projectile)){
//	 score++;
//	 System.out.println(score);
//	 o1.isAlive = false;
//	 o2.isAlive = false;
//	 }
//	 else if((o1 instanceof aliens && o2 instanceof Rocketship) ||
//	(o2 instanceof aliens && o1 instanceof Rocketship)){
//	o1.isAlive = false;
//	o2.isAlive = false;
//	 }
//	
//	}
//	}
//	 }
//	 }

	public int getMiners() {
		return miners;
	}

	public void setMiners(int m) {
		miners = m;
	}

	public void reset() {
		objects.clear();
	}
}