package list.arrayList;

import java.util.Arrays;
import java.util.List;

public class AL03 {
	public static void main(String[] args) {
		String[] strArr = {"a", "b", "c"}; 
		List<String> list = Arrays.asList(strArr);
		System.out.println(list);
				
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		int sum = 0;
		for(int num : intList) {
			sum += num;
		}
		System.out.println("합계: " + sum);
		System.out.println("--------------");
		sum = 0;
		for(int i = 0; i < intList.size(); i++) {
			sum += intList.get(i);
		}
		System.out.println("합계: " + sum);
		System.out.println("--------------");
		//Arrays.asList()는 고정 크기 리스트 반환 - 추가 삭제 안 됨
		//list.clear();
		System.out.println(list.size());
		//list.add("d");
	}
}
