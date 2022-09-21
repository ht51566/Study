package array;

public class Arr01 {
	public static void main(String[] args) {
		
		//배열: 같은 타입의 여러 값을 하나의 묶음으로 다루는 효율적인 객체
		
		//정수 배열 선언
		int[] n1; //integer 배열 n1을 선언, 초기화 안 되어서 사용 불가
//		System.out.println(n1);
		n1 = new int[1000]; //1000칸짜리 배열 생성 - 메모리에 정수 저장 공간 1000개가 만들어지고 0으로 초기화
		System.out.println(n1);
		System.out.println(n1[0]); //0
		
		//float 배열 50칸 ArrayIndexOutOfBoundsException 선언 및 생성
		float[] f1 = new float[50];
		System.out.println(f1[0]); //0.0으로 초기화
		
		//boolean 배열 5칸 
		boolean[] b1 = new boolean[5];
		System.out.println(b1[0]); //false로 초기화
		b1[3] = true;
//		java의 Array(배열)은 한 번 만들면 확장 불가능
		//b1[5] = true; //ArrayIndexOutOfBoundsException
		//b1[1] = "wow";
		
		//char 배열 10칸
		char[] c1 = new char[10];
		System.out.println(c1[0]); // ' '로 초기화
		
		//String 배열 5칸
		String[] s1 = new String[5];
		System.out.println(s1[0]); //null로 초기화
		
	}
}
