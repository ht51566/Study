package generics_basic;

import java.util.ArrayList;
import java.util.List;

public class List_Generics {

	public static void main(String[] args) {

		// Generics 없으면 리스트의 원소를 Object로 처리하므로 모든 타입 사용 가능
		List list = new ArrayList();
		list.add("hi");
		list.add(7);
		list.add(true);

		for (Object obj : list) {
			System.out.println(obj);
		}

		// java 5까지의 사용법
		// Generics 사용하지 않을 때의 위험성 및 불편함:
		// 어떤 타입의 데이터가 저장되어 있는지 알아야 하고 꼭 강제 형변환 시켜야 사용 가능
		String str = (String) list.get(0);
		int sum = 3 + (int)list.get(1);
		
		//Generics: 형변환 없이 사용 가능 
		List<String> li = new ArrayList<>();
		li.add("강동진 천재");
//		li.add(99);
//		li.add(true);
		
		str = li.get(0);

	}
}
