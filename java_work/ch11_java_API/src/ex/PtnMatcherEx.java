package ex;

import java.util.regex.Pattern;

public class PtnMatcherEx {

	public static void main(String[] args) {
		
		// id: 대소문자 구분없이 영문자로 시작 / 영어, 숫자 아무거나 / 8~12자 사이
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		String id = "aaaa5Angel1004";
		
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}	
	}
}
