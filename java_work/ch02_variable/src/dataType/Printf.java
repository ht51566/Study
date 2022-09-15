package dataType;

public class Printf {
	public static void main(String[] args) {
		
		//println: 출력 후 줄바꾸기
		System.out.println("--------------------------");
		System.out.print("--------------------------");
		System.out.print(">>>>");
		System.out.println("****");
		
		//printf: 형식 지정 출력 - 줄 안 바꿈
		//타입 지정: %c-char, %s-String, %d-정수, %f-실수, %b-boolean
		// \ - escape문자:뒤에 나오는 문자를 본래 의미가 아닌 것으로 적용
		// \n - 줄바꾸기, \t - tab, \를 본래 의미(백슬래시)로 사용하려면 \\
		
		System.out.println("문자 "+'A'+"의 유니코드 값은 "+(int)'A');
		System.out.printf("문자 %c의 유니코드 값은 %d\n", 'A', (int)'A');
		System.out.printf("문자 %c의 유니코드 값은 %d\n", 'a', (int)'a');
		System.out.printf("문자 %c의 유니코드 값은 %d: %b\n", 'a', (int)'a', true);

		System.out.printf("3자리 숫자: %d는 %s다 => %b\n", 379, "짝수", false);
		System.out.printf("열 자리에 3자리 숫자 %10d를 오른쪽 정렬\n", 379);
		System.out.printf("열 자리에 3자리 숫자 %-10d를 왼쪽 정렬\n", 379);
		System.out.printf("열 자리에 3자리 숫자 %d를 출력하되 빈자리 0으로 채움 : %010d\n", 379, 379);

		System.out.printf("%f를 반올림해서 소수점 2째자리까지 표시하면 %.2f가 됩니다.\n", 3.141592, 3.141592);
		System.out.printf("%f를 반올림해서 정수 다섯 자리, 소수점 2째자리까지 표시하면 %07.2f가 됩니다.\n", 3.141592, 3.141592);
		
		
	}
}
