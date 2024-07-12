package sec;

class EarthEX {
	static final double EARTH_RADIUS = 6400;
	
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}


public class Earth{
	public static void main(String[] args) {
		
		System.out.println("지구의 반지름: " + EarthEX.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적: " + EarthEX.EARTH_SURFACE_AREA + "km^2");
	}
}
