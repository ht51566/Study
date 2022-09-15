package dataType;

public class Dt04_String {
	public static void main(String[] args) {
		//문자열은 기본타입이 아니다.
		//참조변수 - 문자의 배열이다
		
		int a = 7; //기본타입 변수
		Integer b = new Integer(7); //참조변수
		//a.
		System.out.println(b.getClass());
		
		String str = "홍길동"; //참조 타입, 객체의 필드와 메소드에 접근 가능
		String str2 = new String("홍길동");
		System.out.println(str);
		System.out.println(str.charAt(0));
	}
}
