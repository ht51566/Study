package map.TreeMap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TM01 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(94), "길동");
		scores.put(new Integer(67), "동");
		scores.put(new Integer(37), "홍동");
		scores.put(new Integer(81), "홍길");
		scores.put(new Integer(90), "홍");
		
		System.out.println(scores);
		
		Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("꼴찌에게 영광을 => " + entry.getValue() + " : " + entry.getKey());
		
		entry = scores.lastEntry();
		System.out.println("일등에게 영광을 => " + entry.getValue() + " : " + entry.getKey());
		
		System.out.println("---------------------------------------");
		while(!scores.isEmpty()) {
			entry = scores.pollLastEntry();
			System.out.println("영광을 => " + entry.getValue() + " : " + entry.getKey());
		}
		System.out.println("출력 완료");
		System.out.println(scores.size());
		
		
		
	}
}
