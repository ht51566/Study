package variable;

public class Var02 {
	public static void main(String[] args) {
		int var1 = 15;
		int var2, var3;
//		var4 = 10; //선언하지 않은 변수 사용 불가
//		int var4 = var2 + var3; //초기화 되지 않은 변수 사용 불가
		
		var2 = 015; //8진수
		var3 = 0x15; //16진수
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
	}
}
