package api08_Wrapper;

import java.util.ArrayList;
import java.util.List;

public class Unboxing {
	
	public static void main(String[] args) {
		
		//기본 타입
		int num1 = 300; 
		int num2 = 300;
		System.out.println(num1 == num2);
		
		Integer it1 = 300;
		Integer it2 = 300;
		System.out.println(it1 == it2); // false - 주소 비교
		System.out.println(num1 == it2);// true - 값 비교 - 연산시 자동 언박싱
		
		Integer it3 = 111;
		Integer it4 = 111;
		System.out.println(it3 == it4); // true - 값 비교 - -128~127 byte 범위 안에서는 자동 언박싱 기본 타입이 됨
		
//		intValue() => 언박싱 메소드
		System.out.println(it1.intValue() == it2.intValue());
		
		List<Integer> list = new ArrayList<>();
		list.add(it1);
		list.add(num1); //자동 박싱
		int a = list.get(0); //자동 언박싱
		list.add(Integer.parseInt("1000"));
	}
}
