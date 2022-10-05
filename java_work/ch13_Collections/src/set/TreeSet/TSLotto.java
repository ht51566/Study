package set.TreeSet;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TSLotto {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		Random rd = new Random();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = rd.nextInt(45) + 1;
			set.add(num);
		}
		
		System.out.println("금주의 당첨 번호 : " + set);
	}
}
