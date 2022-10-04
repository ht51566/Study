package api08_Wrapper;

public class CharacterMethod {

	public static void main(String[] args) {
		char a = 'A';
		// a.

		char[] obj = { '1', 'a', '#', 'B', ' ', '家' };
		for (char c : obj) {
			System.out.println("문자 [" + c + "]");

			if (Character.isDefined(c))
				System.out.println("유니코드입니다.");
			if (Character.isDigit(c))
				System.out.println("숫자입니다.");
			if (Character.isLetter(c))
				System.out.println("문자입니다.");
			if (Character.isLowerCase(c))
				System.out.println("소문자입니다.");
			if (Character.isUpperCase(c))
				System.out.println("대문자입니다.");
			if (Character.isWhitespace(c))
				System.out.println("공백입니다.");
			if (Character.isIdeographic(c))
				System.out.println("표의문자입니다.");

			System.out.println("=======================");
			
			
		}
	}
}
