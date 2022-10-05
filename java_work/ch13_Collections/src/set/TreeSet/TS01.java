package set.TreeSet;

import java.util.TreeSet;

public class TS01 {
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		
		set.add("car");
		set.add("area");
		set.add("b");
		set.add("ball");
		set.add("d");
		set.add("dress");
		set.add("zigzag");
		set.add("house");
		set.add("love");
		set.add("take");
		set.add("da");
		set.add("cz");
		
		System.out.println(set);

		String from = "b";
		String to = "d";
		
		System.out.println(set.subSet(from, true, to, true));
		
		
		
		
	}
}
