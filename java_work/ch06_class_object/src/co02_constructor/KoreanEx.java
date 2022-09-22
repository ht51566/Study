package co02_constructor;

public class KoreanEx {
	public static void main(String[] args) {
		
		Korean k1 = new Korean(); //기본 생성자를 이용해서 생성
		k1.name = "세종대왕";
		k1.age = 33;
		k1.gender = "male";
		System.out.println(k1.name);
		k1.say();
		System.out.println("----------------------");
		//매개변수 2개 짜리 생성자
		Korean k2 = new Korean("황진이", 22);
		k2.gender = "female";
		System.out.println(k2.name);
		k2.say();
		k2.smile();
		System.out.println("----------------------");
		Korean k3 = new Korean("ace", 37, "male");
		Korean k4 = new Korean("우꿀라", 817, "woocl");
		
		Korean[] koreans = {k1, k2, k3, k4};
		
		for(Korean k : koreans) {
			System.out.println(k.name);
			k.smile();
			System.out.println("----------------------");
		}
	}
}
