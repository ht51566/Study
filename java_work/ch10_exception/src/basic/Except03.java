package basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Except03 {
	public static void main(String[] args) throws IOException {

		FileReader reader = null;
		try {
			reader = new FileReader("a.txt");

			String str = null;
			str = "abc";
			System.out.println(str.charAt(2));
			char[] ch = new char[3];
			ch[3] = str.charAt(0);
			// 좁은 범위에서 넓은 범위로 처리해야 함
//		} catch (Exception e) {
//			System.out.println("알 수 없는 예외 발생 ㅋㅋㅋ");	
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("그런 파일 없는데 ㅋㅋㅋ");
		} catch (NullPointerException e) {
			System.out.println("문자열이 널이넹 ㅋㅋ");
			// multi catch
		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 초과 ㅋㅋ");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외 발생 ㅋㅋㅋ");
		} finally {
			System.out.println("finally ~~~");

			try {
				if (reader != null) {
					reader.close(); // NullPointerException
				}
			} catch (NullPointerException e) {
				System.out.println("err ㅋㅋㅋ");
			}
		}
		
		System.out.println("program end");
		
	}
}
