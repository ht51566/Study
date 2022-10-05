package map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HM02 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("sky", "1234");
		map.put("land", "234");
		map.put("ocean", "34");
		
//		System.out.println(map);
//		System.out.println(map.get("sky"));
		
		Scanner sc = new Scanner(System.in);
		
		Set<String> set = map.keySet();
		System.out.println(set);
		Iterator<String> it = set.iterator();
		Loop: while(true) {
			System.out.println("id >>> ");
			String id = sc.nextLine().trim();
			//id 확인 코드 - 없으면 continue
			for(String s : set) {
//			while(it.hasNext()) {
				if(id.equals(s)) {
//				if(id.equals(it.next())) {
					System.out.println("password >>> ");
					String password = sc.nextLine().trim();
					//password 확인 - 비번 맞으면 Login Success 출력하고 빠져나감
					if(password.equals(map.get(id))) {
						System.out.println("Login Success");
						break Loop;
					}else {
						System.out.println("비밀번호 오류!");
					}
				}
			}
			System.out.println("그런 id가 없습니다");
		}
		
//		while(true) {
//			System.out.println("id >>> ");
//			String id = sc.nextLine().trim();
//			
//			if(!map.containsKey(id)) {
//				System.out.println("그런 id가 없습니다");
//				continue;
//			}
//			
//			System.out.println("password >>> ");
//			String password = sc.nextLine().trim();
//			if(map.get(id).equals(password)) {
//				System.out.println("Login Success");
//				break;
//			}else {
//				System.out.println("비밀번호 오류!");
//			}
//		}
		
//		sc.close();
	}
}
