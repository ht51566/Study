package list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL02 {
	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(5));
		intList.add(new Integer(4));
		intList.add(new Integer(2));
		intList.add(3);
		intList.add(new Integer(0));
		intList.add(new Integer(1));

		// subList(): 리스트의 특정 인덱스 범위를 리스트로 반환
		List<Integer> intList2 = new ArrayList<>(intList.subList(1, 4));
		print("subList()", intList, intList2);

		// sort(): 리스트 오름차순 정렬
		Collections.sort(intList);
		Collections.sort(intList2);
		print("sort()", intList, intList2);

		// reverse(): 리스트 내림차순 정렬
		Collections.reverse(intList);
		Collections.reverse(intList2);
		print("reverse()", intList, intList2);

		// containsAll: 특정 리스트의 전체 요소들을 모두 포함하고 있는지 불리언 반환
		// contains: 특정 오브젝트를 포함하고 있느지 불리언 반환
		System.out.println("intList.containsAll(intList2): " + intList.containsAll(intList2));
		System.out.println("intList.contains(7):" + intList.contains(7));

		// set(): 특정 인덱스의 요소를 교체
		intList.set(2, 100);
		print("set()", intList, intList2);

		// retainAll(): 특정 리스트의 요소와 중복되는 것만 남기고 나머지는 삭제: - 교집합
		// 중복되는 요소가 있으면 true반환
		System.out.println(intList.retainAll(intList2));
		print("retainAll()", intList, intList2);

		// removeAll(): 특정 리스트의 요소와 중복되는 것을 삭제: - 차집합
		// 중복되는 요소가 있으면 true반환
		System.out.println(intList2.removeAll(intList));
		print("removeAll()", intList, intList2);
		
		//print("removeAll()", intList, intList2);() - 합집합
		System.out.println(intList.addAll(intList2));
		print("addAll()", intList, intList2);
	}

	private static void print(String str, ArrayList<Integer> intList, List<Integer> intList2) {
		System.out.printf("----  %s ----\n", str);
		System.out.println(intList);
		System.out.println(intList2);
		System.out.println("--------------------");

	}
}
