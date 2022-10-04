package api04_regex;

import java.util.regex.Pattern;

public class PatternEx {
	public static void main(String[] args) {
		
		String exp = "(02|010)-\\d{3,4}-\\d{4}";
		String phone = "010-1234-1234";
		
		boolean result = Pattern.matches(exp, phone);
		System.out.println(result);
		
		phone = "011-1234-1234";
		result = Pattern.matches(exp, phone);
		System.out.println(result);
		
		String regExp = "\\w+@\\w+\\.\\w+";
		//숫자나 알파벳 한 글자 이상 @ 숫자나 알파벳 한 글자 이상 . 숫자나 알파벳 한 글자 이상 
		String data0 = "angel@ace.com";
		String data1 = "angel.101@ace.com";
		String data2 = "angel.101@biz.co.kr";
		
		result = Pattern.matches(regExp, data0);
		System.out.println(result);
		
		result = Pattern.matches(regExp, data1);
		System.out.println(result);
		regExp = "\\w+\\.\\w+@\\w+\\.\\w+";
		result = Pattern.matches(regExp, data1);
		System.out.println(result);
		
		
		result = Pattern.matches(regExp, data2);
		System.out.println(result);
		regExp = "\\w+\\.\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regExp, data2);
		System.out.println(result);
		
	}
}
