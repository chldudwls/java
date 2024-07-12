package sec4;

public class Super extends Airplane{
	
	public static int NORMAL = 1;
	public static int SUPERSONIC = 2;
	public int flymode = NORMAL;


	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행을합니다");
		}else {
			super.fiy();
		}
	}
	
}
