package ROBOT_SPACESHIP_BATTLE;

public class PL1 extends gameObject {

	public static boolean right = false;
	public static boolean left = false;
	public static boolean up = false; 
	public static boolean down =false;
	public PL1(int x, int y, int width, int height, int img) {
		this.x= x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.img = img;
	}
	@Override
	void update() {
		// TODO Auto-generated method stub
		if (right){
			x+=5;
			System.out.println("Right");
			right = false;
			
		}
		if (left){
			x-=5;
			System.out.println("left");
			left = false;
			
		}
		if (up){
			y-=5;
			System.out.println("Up");
			up = false;
			
		}
		if (down){
			y+=5;
			System.out.println("Down");
			down = false;
			
		}
	}
}
