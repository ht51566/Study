package list.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Link01 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> intList = new LinkedList<>();
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < 100; i++) {
			intList.add(i);
		}
		for(int i : intList) {
			System.out.print(i + "|");
		}
		System.out.println("\n-----------------------------------------------");
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long start, end;
		
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			//i를 String으로 만들어서 0번 인덱스에 추가 - 기존의 값들은 뒤로 한 칸씩 밀려난다 
			list1.add(0, String.valueOf(i));
		}
		//0번 인덱스 값을 삭제 - 이후 값들이 한 칸씩 앞으로 이동
		list1.remove(0);
		end = System.nanoTime();
		System.out.println("ArrayList: " + (end - start) + "나노초");
		
		
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			//i를 String으로 만들어서 0번 인덱스에 추가 - 기존의 값들은 뒤로 한 칸씩 밀려난다 
			list2.add(0, String.valueOf(i));
		}
		//0번 인덱스 값을 삭제 - 이후 값들이 한 칸씩 앞으로 이동
		list2.remove(0);
		end = System.nanoTime();
		System.out.println("LinkedList: " + (end - start) + "나노초");
	}
}
