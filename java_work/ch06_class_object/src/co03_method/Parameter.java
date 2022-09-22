package co03_method;

public class Parameter {

	// 매개변수가 2개로 고정된 메소드
	int sum1(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

	// 배열을 매개변수로 받는 메소드 - 배열의 원소 개수는 무관
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	// 정해지지 않은 개수의 매개변수 받는 메소드 - 배열도 받고 여러 개의 값도 받을 수 있다
	int sum2(int ... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	void prize(String ... students) {
		for(String name : students) {
			if(name.charAt(0) == '이') {
				 System.out.println(name + ", ㅊㅋㅊㅋ!!!");
			}
		}
	}
}
