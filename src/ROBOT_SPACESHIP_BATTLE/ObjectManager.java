package ROBOT_SPACESHIP_BATTLE;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	ArrayList<gameObject> objects;
	int isInfoVisable = 0 ;
	private int pl1miners = 5;
	private int pl2miners = 0;
	private int minerCost = 10;
	private double pl1totalMinerals = 0;
	private int pl1totalMineralsRounded;
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
	public void clock() {
		pl1totalMinerals =pl1totalMinerals+getPl1Miners() *0.02;
		pl1totalMineralsRounded= (int) Math.round(pl1totalMinerals);
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

	//Pl1 Mining System
	public int getPl1Miners() {
		return pl1miners;
	}

	public void setPl1Miners(int m) {
		pl1miners = m;
	}
	
	public int getPl1minerals() {
		return pl1totalMineralsRounded;
	}
	public void setPl1minerals(int m) {
		pl1totalMinerals = m;
	}
	
	//PL2 Mining System
	public int getPl2Miners() {
		return pl2miners;
	}

	public void setPl2Miners(int m) {
		pl2miners = m;
	}
	
	
	
	public int getMinerCost() {
		return minerCost;
	}
	
	public void setInfoVisable(int m) {
		isInfoVisable = m;
		System.out.println(isInfoVisable);
	}
	public int getInfoVisable() {
		return isInfoVisable;
		
	}
	
	
	public void reset() {
		objects.clear();
	}
}