package array;

import java.util.Arrays;

public class Arr06 {
	public static void main(String[] args) {
		
		String[] name = {"atom", "jane", "tom", "sam"};
		System.out.println(name[2].charAt(0));
		
		int[] num = {1,2,3,4};
			
		System.out.println(Arrays.toString(name));
		
		System.out.println("-------------------");
		for(int n : num) {
			System.out.println(n);
		}
		System.out.println("-------------------");
		for(String s : name) {
			System.out.println(s);
		}
	}
}
