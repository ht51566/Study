package array;

public class Arr02 {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("------------");
		// 3칸짜리 정수 배열 선언 및 생성
		int[] arr1 = new int[3];
		// index를 이용해서 배열에 값 입력
		arr1[0] = a;
		arr1[1] = b;
		arr1[2] = c;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("------------");
		int[] arr2 = { 10, 20, 30 };
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		//arr2[3] = 40; //ArrayIndexOutOfBoundsException
		// System.out.println(arr2[3]); //ArrayIndexOutOfBoundsException
		System.out.println("------------");
		int[] arr3 = new int[10];
		// 배열의 길이
		System.out.println(arr3.length); // 10 - index: 9(length-1)
		System.out.println("------------");
//		arr3[0] = 100; ~~~
		// for문으로 배열에 규칙적인 값 입력
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (i + 1) * 100;
		}
		// 배열 값 for문으로 출력
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
		System.out.println("------------");
		// char 배열 26칸을 만들고 alphabet(A: 65)을 넣으시오.
		// 배열을 출력하시오
		char[] c1 = new char[26];
		for (int i = 0; i < c1.length; i++) {
			c1[i] = (char) (i + 65);
			System.out.println("c1[" + i + "] = " + c1[i]);
		}
	}
}
