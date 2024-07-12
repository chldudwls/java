package sec4;

public class Example {
	public static void main(String[] args) {
		Super sa = new Super();
		sa.takeOff();
		sa.fiy();
		sa.flymode=Super.SUPERSONIC;
		sa.fly();
		sa.flymode=Super.NORMAL;
		sa.fiy();
		sa.land();
				
	}
}
