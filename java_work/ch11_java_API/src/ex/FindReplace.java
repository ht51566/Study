package ex;

import java.util.StringTokenizer;

public class FindReplace {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1(split() 메소드 이용)
		String[] tokens = str.split(",");
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println();
		
		
		//방법2(StringTokenizer 이용)
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//"자바"가 포함되어 있으면 "JAVA"로 바꾸어 출력, 포함 X면 ~~~
		String str2 = "모든 프로그램은 자바 언어로 개발될 수 있다."; 
		if(str2.indexOf("자바") != -1) {
			System.out.println(str2.replace("자바", "JAVA"));
		}else {
			System.out.println("포함 NO!!!");
		}
		
	}
}
