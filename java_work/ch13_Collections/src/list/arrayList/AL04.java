package list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class AL04 {
	public static void main(String[] args) {
		final int LIMIT = 10;	// 자르고자 하는 글자의 개수를 지정한다.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; 
		int length = source.length(); 
		System.out.println(length);//43
		List<String> list = null;
		
		//캐릭터 10개씩 끊어서 문자열로 만들어 리스트에 추가
		
		//문자열을 넣을 리스트 생성 - 칸 수를 지정
		if(length % LIMIT == 0 ) {
			list = new ArrayList<>(length/LIMIT);
		}else {
			list = new ArrayList<>(length/LIMIT + 1);
		}
		
		for(int i = 0; i < length; i+=LIMIT) {
			if(i+LIMIT < length) {
				list.add(source.substring(i, i+LIMIT));
			}else{
				list.add(source.substring(i));
			}
		}
		
		for(String s: list) {
			System.out.println(s);
		}
		
		
	}
}
