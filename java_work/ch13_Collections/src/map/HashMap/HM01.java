package map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HM01 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("tom", 94);
		map.put("nom", 94);
		map.put("mom", 34);
		map.put("pom", 84);
		map.put("som", 74);
		map.put("lom", 64); 
		map.put("tom", 68); 
		
		System.out.println(map);
		
		System.out.println("==================================");
		System.out.println("총 Entry 수: " + map.size());
		System.out.println("mom: " + map.get("mom"));
		
		System.out.println("==================================");
		Set<String> set = map.keySet();
		System.out.println(set);
		for(String key : set) {
			System.out.printf("key: %s, value: %d\n", key, map.get(key));
		}
		System.out.println("==================================");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("key: %s, value: %d\n", key, map.get(key));
		}
		System.out.println("==================================");
		Set<Entry<String, Integer>> entry = map.entrySet();
		System.out.println(entry.size());
		for(Entry<String, Integer> en : entry) {
			System.out.println(en);
			System.out.println(en.getKey());
			//System.out.println(en.getValue());
			System.out.println(map.get(en.getKey()));
		}
		System.out.println("==================================");
		Iterator<Entry<String, Integer>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			Entry<String, Integer> en = iterator.next();
			String key = en.getKey();
			int value = en.getValue();
			System.out.println(key + " : " + value);
			if(map.get(key)>= 90) {
				System.out.println("good!!!");
			}else if(map.get(key)< 60) {
				System.out.println("more effort");
			}else {
				System.out.println("soso");
			}
		}
		
		System.out.println("==================================");
			
		map.remove("som");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		
	}
}
