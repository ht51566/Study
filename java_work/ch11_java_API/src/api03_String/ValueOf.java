package api03_String;

public class ValueOf {
	public static void main(String[] args) {
		
		//primitive type 
		int a = 10;
		double b = 10.5;
		boolean c = true;
		
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);
		String str3 = String.valueOf(c);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(a + b);
		//String으로 형변환 된 상태에서 덧셈 연산은 String concat
		System.out.println(str1 + str2);
		//20.5 => 숫자 타입으로 형변환
		System.out.println(Integer.parseInt(str1)+ Double.parseDouble(str2));
		
	}
}
