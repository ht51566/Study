package co05_final;

public class Final02 {
	
	//상수(constant): 수정 불가, 선언과 동시에 혹은 static 블록에서 초기화
	//전부 대문자로만 표기, 단어 사이는  _ 로 표시
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	public Final02() {
		//EARTH_SURFACE_AREA = EARTH_RADIUS * EARTH_RADIUS * Math.PI * 4;
	}
	
	static {
		EARTH_SURFACE_AREA = EARTH_RADIUS * EARTH_RADIUS * Math.PI * 4;
	}
	
	public static void main(String[] args) {
		System.out.println("지구 반지름: " + EARTH_RADIUS);
		System.out.println("지구 표면적: " + EARTH_SURFACE_AREA);
		System.out.println(Math.PI);
	}
}
