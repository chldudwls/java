package sec;
	public class bntu{
	String model;
	int speed;
	
	 bntu(String model, int speed){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		this.setSpeed(100);
	System.out.println(this.model + "가 달립니다.(시속:"+this.speed + "km/h");
	}
	
	
	

	
	public static void main(String[] args) {
		 bntu myaar = new  bntu("포르쉐", 0);
		 bntu yourcar = new  bntu("벤츠", 0);
		
		myaar.run();
		yourcar.run();
	}
}
