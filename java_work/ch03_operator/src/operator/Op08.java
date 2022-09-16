package operator;

import java.io.IOException;

public class Op08 {
	public static void main(String[] args) throws IOException {
		
		//3항식: 조건식?  true 반환값 : false 반환값
		
		System.out.println("한 자리 숫자를 입력하셈 >>> ");
		int num = System.in.read() - '0';
		
//		System.out.println(num);
		
//		if(num % 2 == 0) {
//			System.out.printf("%d는 %s입니다.\n", num, "짝수");
//		}else {
//			System.out.printf("%d는 %s입니다.\n", num, "홀수");
//		}
		
		System.out.printf("%d는 %s입니다.\n", num, num % 2 == 0? "짝수" : "홀수");
	}
}
