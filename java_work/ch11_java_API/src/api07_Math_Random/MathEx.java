package api07_Math_Random;

public class MathEx {
	public static void main(String[] args) {
		
		
		//random()
		int dice = (int)(Math.random()*6) + 1;
		int lotto = (int)(Math.random()*45) + 1;
		
		//PI
		int r = 7;
		double circalArea = Math.PI * r * r;
		
		//절대값 abs()
		int a = -3;
		System.out.println(Math.abs(a));
		
		double a2 = -5.95;
		System.out.println(Math.abs(a2));
		
		System.out.println(Math.ceil(a2));
		
		System.out.println(Math.floor(a2));
		
		System.out.println(Math.round(a2));
		
		//근사값 - 가까운 쪽 정수 반환
		System.out.println(Math.rint(5.35));
		//딱반이면 가까운 짝수 반환
		System.out.println(Math.rint(6.5));
		
		System.out.println(Math.pow(2, 3));
		
	}
}
