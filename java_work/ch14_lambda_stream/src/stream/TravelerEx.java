package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class TravelerEx {
	public static void main(String[] args) {
		
		
		Traveler lee = new Traveler("이순신", 41, 150);
		Traveler kim = new Traveler("김유신", 33, 100);
		Traveler hong = new Traveler("홍길동", 29, 80);
		
		List<Traveler> list = new ArrayList<>();
		list.add(lee);
		list.add(kim);
		list.add(hong);
		
		System.out.println("순서대로 명단 출력");
		list.stream().map(t -> t.getName()).forEach(name ->System.out.println(name));
		
		System.out.println("총 여행 비용");
		int total = list.stream().mapToInt(t -> t.getMoney()).sum();
		OptionalDouble avg = list.stream().mapToInt(t -> t.getMoney()).average();
		System.out.println(total);
		System.out.println(avg);
		
		System.out.println("30세 이상 고객 명단 출력 - 가나다순");
		list.stream().filter(customer -> customer.getAge() >= 30)
					.map(c -> c.getName())
					.sorted()
					.forEach(n -> System.out.println(n));
		
	}
}
