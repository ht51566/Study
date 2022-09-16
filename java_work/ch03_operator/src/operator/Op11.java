package operator;

public class Op11 {
	public static void main(String[] args) {
		
		// String 연산 - 덧셈만 가능
		String a = "I ";
		String b = "love ";
		String c = "You ";
		
		String d = a + b + c;
		System.out.println(d);
		
		//String + 아무거나 => String
		String e = "Java ";
		System.out.println(e + 1.8);
		
		//곱셈 등 기타 연산은 안 된다.
//		System.out.println(e * 3);
		
		String str1 = "왕만두";
		String str2 = "왕만두";
		
		System.out.println(str1 == str2? "같넹 ㅋㅋㅋ" : "안 같넹 ㅋㅋㅋ");
		
		String str3 = new String("왕만두");
		
		System.out.println(str1 == str3? "같넹 ㅋㅋㅋ" : "안 같넹 ㅋㅋㅋ");

		System.out.println(str1.equals(str3) ? "같넹 ㅋㅋㅋ" : "안 같넹 ㅋㅋㅋ");
		
		
	}
}
