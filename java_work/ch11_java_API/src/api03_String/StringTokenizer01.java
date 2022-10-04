package api03_String;

import java.util.StringTokenizer;

public class StringTokenizer01 {
	
	public static void main(String[] args) {
		String txt = "에디슨/안창호/유관순";
		String[] persons = txt.split("/");
		for(String p : persons) {
			System.out.println(p);
		}
		System.out.println("-------------------------");
		
		StringTokenizer st = new StringTokenizer(txt, "/");
		int tokenNum = st.countTokens();
		System.out.println(tokenNum);
		for(int i =0; i < tokenNum; i++ ) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("-----------------------");
		st = new StringTokenizer(txt, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
}
