package api02_System_Class;

import java.util.Scanner;

public class Exit {
	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				System.out.println(status);
			}
		});
		
		System.exit(0);
		
		Scanner sc = new Scanner(System.in);
	}
}
