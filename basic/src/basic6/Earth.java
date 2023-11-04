package basic6;

public class Earth {
	//불변의 값 : 파이, 지구의 무게 및 둘레 등등 -> 이러한 절대적인 값들은 상수로써 지정할 것.
	// 상수(constant) : static final 로 선언 -> 선언 시 전 문자 대문자로 네이밍.
	
	//f
	static final double EARTH_RADIUS = 6400;
	
	static final double EARTH_SURFACE_AREA;
	
	
	//c
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
	}
	
	
	
	
	//i
	
	






}
