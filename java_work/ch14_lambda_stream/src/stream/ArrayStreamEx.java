package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int sum = 0;
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += i;
		}
		
		Arrays.stream(arr).forEach(num -> System.out.println(num));
		
		sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max);
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum2);
		
		int count = (int) list.stream().count();
		System.out.println(count);
		
		System.out.println(list.stream().reduce((a, b) -> a * b));
		
		int result = 1;
		for(int n : list) {
			result *= n;
		}
		System.out.println(result);
		
		List<String> sList = new ArrayList<>();
		sList.add("tom");
		sList.add("jack");
		sList.add("edward");
		
		sList.stream().forEach(s -> System.out.println(s));
		sList.stream().sorted().forEach(s -> System.out.println(s));
		sList.stream().sorted().map(s -> s.length()).forEach(n -> System.out.println(n));
		sList.stream().sorted().filter(s -> s.length() >= 4).forEach(s -> System.out.println(s));
		
		
		
	}
}
