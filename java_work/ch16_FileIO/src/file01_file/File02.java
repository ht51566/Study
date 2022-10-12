package file01_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File02 {
	
	public static void main(String[] args) {
		
		File file = new File("d:/ace/temp/wow.txt");
		
		//시스템의 입력 장치를 활용
//		Scanner sc = new Scanner(System.in);
//		System.out.println("오늘의 명언 >>> ");
//		String str = sc.nextLine();
//		System.out.println(str);
		
		try {
			Scanner sc = new Scanner(file, "utf-8");
			while(sc.hasNext()) {
				System.out.print(sc.next()+" ");
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
