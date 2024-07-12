package sec1;
	 class CarEx{
	
private int speed;
private boolean stop;

public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	if(speed < 0) {
		this.speed = 0;
	}else {
		this.speed = speed;
	}
}

public boolean isStop() {
	return stop;
}
public void setstop(boolean stop) {
	this.stop = stop;
	if(stop == true) this.speed = 0;
}
}

public class Car {
	public static void main(String[] args) {
		CarEx mycar = new CarEx();
		
		mycar.setSpeed(-50);
		System.out.println("현재 속도:" +mycar.getSpeed());
		
		mycar.setSpeed(60);
		System.out.println("햔제 속도:" +mycar.getSpeed());
		
		if(!mycar.isStop()) {
			mycar.setstop(true);
		}
		System.out.println("현재 속도:" +mycar.getSpeed());
	}
}
