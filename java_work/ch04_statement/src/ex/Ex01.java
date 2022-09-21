package ex;

public class Ex01 {
	//1~100까지의 수 가운데 3의 배수의 합
	//3의 배수 나올 때마다 중간합계, 마지막에 최종합계 출력
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if( i % 3 == 0) {
				sum += i;
				System.out.println("중간합계: " + sum);
			}
		}
		System.out.println("최종합계: " + sum);
	}
}
