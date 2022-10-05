package set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HS01 {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		String[] names = { "tom", "mom", "sam", "tom", "wam", "pam" };

		for (String name : names) {
			set.add(name);
		}
		System.out.println(set);
		
		System.out.println("개수: " + set.size());
		
		if(set.contains("mom")) {
			System.out.println(set.remove("mom")); //삭제되면 true 반환
		}else {
			set.add("dad");
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String elem = it.next();
			System.out.println(elem);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println(set.size());
		}
		
		
	}
}
