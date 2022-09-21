package st03_for;

/*
*****
****
***
**
*
*/
public class For07 {

	public static void main(String[] args) {

		char ast = '*';

		int i = 0;
		int j = 0;
		for (i = 0; i < 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print(ast);
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5-i; j++) {
				System.out.print(ast);
			}
			System.out.println();
		}
		
	}
}
