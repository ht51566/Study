package variable;

//변수의 scope : 변수의 사용(참조 가능한) 범위
public class Var03 {
	//클래스 공간
	//int a;
	
	public static void main(String[] args) {
		//main method의 공간
		int var1 = 50; //메인 메소드에서 사용 가능한 변수
		System.out.println("var1 - " + var1);
		System.out.println("------------------");
		if(true) {
			int var2; //if문 안에서 선언 - if 안에서만 사용 가능
			var1 = 10;
			var2 = 20;
			System.out.println("var1 - " + var1);
			System.out.println("var2 - " + var2);
			System.out.println("------------------");
		}
		var1 = 33;
		System.out.println("var1 - " + var1);
//		var2 = 77; //안 보여??? 변수의 scope 외부여서 
//		System.out.println("var2 - " + var2);
		
	}
	
	
}
