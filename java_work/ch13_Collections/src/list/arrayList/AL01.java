package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class AL01 {
	public static void main(String[] args) {
		
		//객체 생성시 부모 타입으로 생성 - 다형성 측면에서 유리
		List<String> list = new ArrayList<>();
		
		//add(e) - 마지막 인덱스에 추가됨
		list.add("Java");
		list.add("JDBC");
		list.add("Java");
		System.out.println(list);
		
		//add(index, e) - 정해진 인덱스에 넣는다. 해당 인덱스 뒤쪽은 밀려남
		list.add(1, "webstandard");
		list.add(2, "spring");
		System.out.println(list);
		
		//list 크기: size()
		int size = list.size();
		System.out.println(size);
		
		//인덱스로 객체 조회
		String skill = list.get(3);
		System.out.println(skill);
		System.out.println("--------------------------------");
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------------------");
		for(String s: list) {
			System.out.println(s);
		}
		System.out.println("--------------------------------");
		//remove(index) - 해당 인덱스의 요소를 삭제하면서 반환
		//remove(e) - 해당 요소를 삭제하면 true 반환, 없었다면 false 반환
		String removed = list.remove(2);
		System.out.println(list);
		System.out.println(removed);
		System.out.println("--------------------------------");
		if(list.remove("Java")) {
			System.out.println("삭제 성공");
			System.out.println(list);
		}else {
			System.out.println("no such object");
		}
		
		list.clear();
		System.out.println(list);
		
		
		
	}
}
