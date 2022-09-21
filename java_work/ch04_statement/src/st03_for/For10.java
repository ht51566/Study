package st03_for;

public class For10 {
	public static void main(String[] args) {
		
		System.out.println("구구단");
		System.out.println("-----------------------------------------------------------------------");
		// 2*1=2 3*1=3
		// 2*2=4 3*2=6
		
		for(int k=2; k<=9; k++) {
			System.out.print(" " + k + "단 \t");
		}
		System.out.println();
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%2d\t", j, i, j*i);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------------");
		
		for(int i = 2; i <= 9; i++) {
			System.out.print(i + "단: ");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%2d\t", i, j, j*i);
			}
			System.out.println();
		}
	}
}
