package st03_for;

public class For08 {
	/*		
	 	*
	   ***
	  *****
	 *******
	*********
	*/

	public static void main(String[] args) {
		char ast = '*';

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print(ast);
			}
			System.out.println();
		}
	}
}
