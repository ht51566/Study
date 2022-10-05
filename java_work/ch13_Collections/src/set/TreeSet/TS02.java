package set.TreeSet;

import java.util.TreeSet;

public class TS02 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		int[] score = {82, 94, 50, 35, 46, 60, 80, 10, 100, 65};
		
		for(int n : score) {
			set.add(n);
		}
		
		System.out.println(set);
		
		System.out.println(set.headSet(60));
		System.out.println(set.tailSet(90));
	}
}
