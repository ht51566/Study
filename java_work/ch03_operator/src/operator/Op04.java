package operator;

public class Op04 {
	public static void main(String[] args) {
		// 증감 연산자
		// ++, --
		
		int num = 10;
		System.out.println(num); //10
		System.out.println(num++); //10
		System.out.println(num--); //11
		System.out.println(num); //10
		
		int num2 = 10;
		int num3 = num2++;
		System.out.printf("num2 = %d, num3 = %d \n", num2, num3);
		
		int tmp = 10;
		System.out.printf("%d %d %d %d %d\n", tmp++, ++tmp, tmp--,
				++tmp, tmp++); //10 12 12 12 12
		System.out.println(tmp);
	}
}
