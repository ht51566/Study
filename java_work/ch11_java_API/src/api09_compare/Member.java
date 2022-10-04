package api09_compare;

import java.util.Arrays;

public class Member implements Comparable<Member>{
	
	String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Member)obj).name);
	}
	
	@Override
	public int compareTo(Member o) {
		return this.name.compareTo(o.name);
	}
	
	
	public static void main(String[] args) {
		Member m1 = new Member("Steve");
		Member m2 = new Member("Edward");
		Member m3 = new Member("Adam");
		Member m4 = new Member("Steve");
		
		Member[] mem = {m1, m2, m3, m4};
		System.out.println(Arrays.toString(mem));
		if(m1.equals(m4)) {
			System.out.println("same");
		}else {
			System.out.println("other");
		}
		
		Arrays.sort(mem);
		System.out.println(Arrays.toString(mem));
		System.out.println();
		
	}

}


