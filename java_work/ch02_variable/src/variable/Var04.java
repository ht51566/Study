package variable;

public class Var04 {
	public static void main(String[] args) {
		
		int x = 10, y = 20;
		System.out.println("x: " + x + " / y: " + y);
		
		x = y; //x 값이 20으로 치환
		y = x; //y 값이 20에서 다시 20으로 그냥 유지됨
		System.out.println("x: " + x + " / y: " + y);
		
		x = 10;
		System.out.println("x: " + x + " / y: " + y);
		
		// x와 y의 값을 교환하고 싶으면 임시 변수를 활용
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + " / y: " + y);
	}
}
