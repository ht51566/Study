package api03_String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Str02 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str1 = "안녕하세요";
		byte[] b1 = str1.getBytes(); //String -> byte[]
		System.out.println(Arrays.toString(b1));
		System.out.println(b1.length);
		String str2 = new String(b1);
		System.out.println(str2);
		
		b1 = str2.getBytes("euckr");
		System.out.println(Arrays.toString(b1));
		System.out.println(b1.length);
		String str3 = new String(b1);
		System.out.println(str3);
		
		b1 = str2.getBytes("utf8");
		System.out.println(Arrays.toString(b1));
		System.out.println(b1.length);
		String str4 = new String(b1);
		System.out.println(str4);
	}
}
