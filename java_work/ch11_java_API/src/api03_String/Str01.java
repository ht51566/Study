package api03_String;

import java.io.IOException;
import java.util.Arrays;

public class Str01 {
	public static void main(String[] args) throws IOException {
		
		String str1 = "wow";
		String str2 = new String("wow");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
//		System.out.println(">> ");
//		int a = System.in.read()-'0';
//		System.out.println(a);
//		System.in.skip(2);
//		System.out.println(">> ");
//		char b = (char) System.in.read();
//		System.out.println(b);
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str3 = new String(bytes);
		System.out.println(str3);
		
		String str4 = new String(bytes, 6, 4);
		System.out.println(str4);
		
		byte[] bytes2 = new byte[100];
		System.out.println(">>> ");
		int readByteNum = System.in.read(bytes2);
		System.out.println(readByteNum);
		System.out.println(Arrays.toString(bytes2));
		String str5 = new String(bytes2, 0, readByteNum-2);
		System.out.println(str5);
		
		char[] greet = {'h','e','l', 'l', 'o'};
		String str6 = new String(greet);
		System.out.println(str6);
		str6 += " world";
		System.out.println(str6);
		
	}
}
