package set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HS03 {
	public static void main(String[] args) {

		HashSet<String> setA = new HashSet<>();
		HashSet<String> setB = new HashSet<>();
		HashSet<String> setHap = new HashSet<>();
		HashSet<String> setKyo = new HashSet<>();
		HashSet<String> setCha = new HashSet<>();

		String[] str1 = { "1", "2", "3", "4", "5" };
		String[] str2 = { "4", "5", "6", "7", "8" };

		for (String s : str1) {
			setA.add(s);
		}
		System.out.println("A: " + setA);
		for (String s : str2) {
			setB.add(s);
		}
		System.out.println("B: " + setB);

		// 교집합
		Iterator<String> it = setB.iterator();
		while (it.hasNext()) {
			String num = it.next();
			if (setA.contains(num)) {
				setKyo.add(num);
			}
		}
		System.out.println("교집합: " + setKyo);

		// 합집합
		Iterator<String> it1 = setA.iterator();
		Iterator<String> it2 = setB.iterator();
		while (it1.hasNext()) {
			String num = it1.next();
			setHap.add(num);
		}
		while (it2.hasNext()) {
			String num = it2.next();
			setHap.add(num);
		}
		System.out.println("합집합: " + setHap);

		// 차집합(A-B)

		it = setA.iterator();
		while (it.hasNext()) {
			String num = it.next();
			if (!setB.contains(num)) {
				setCha.add(num);
			}
		}
		System.out.println("차집합: " + setCha);

		// 부분집합의 판별
		System.out.println("setB가 setA의 부분집합: " + setA.containsAll(setB));

		// 합집합
		if (setA.addAll(setB)) {
			System.out.println("setB와 setA의 합집합:" + setA);
		} else {
			System.out.println("해당 객체가 사용 중입니다.");
		}

		// 교집합
		if (setA.retainAll(setB)) {
			System.out.println("setB와 setA의  교집합:" + setA);
		} else {
			System.out.println("해당 객체가 사용 중입니다.");
		}

		// 차집합
		if (setA.removeAll(setB)) {
			System.out.println("setA - setB(차집합):" + setA);
		} else {
			System.out.println("해당 객체가 사용 중입니다.");
		}
	}
}
