package array;

public class Arr04 {
	//다차원 배열: 표 - 행과 열로 이루어짐 - 행렬
	
	public static void main(String[] args) {
		//3행 3열짜리 2차원 배열 선언, 생성
		int[][] num = new int[3][3];
		
		//가변형 배열: 1행 2열, 2행 3열
		int[][] num1 = new int[2][];
		num1[0] = new int[2];
		num1[1] = new int[3];
		
		System.out.println(num1.length); //2 - 행의 개수
		System.out.println(num1[0].length); // 2 - 첫 번째 행의 열의 개수
		System.out.println(num1[1].length); // 3 - 두 번째 행의 열의 개수
		
		num1[0][0] = 11;
		num1[0][1] = 22;
		num1[1][0] = 33;
		num1[1][1] = 44;
		num1[1][2] = 55;
		
		System.out.println(num1); //[[I@15db9742 - [I@6d06d69c, [I@7852e922
		System.out.println(num1[0]); //[I@6d06d69c
		System.out.println(num1[1]); //[I@7852e922
		System.out.println("-----------------------------------");
		for(int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
			for(int j = 0; j < num1[i].length; j++) {
				System.out.printf("num1[%d][%d] = %d \n", i, j, num1[i][j]);
			}
		}
		System.out.println("-----------------------------------");
		for(int[] row : num1) {
			for(int col : row) {
				System.out.printf("%d / ", col);
			}
		}
		System.out.println("-----------------------------------");
		
	}
}
