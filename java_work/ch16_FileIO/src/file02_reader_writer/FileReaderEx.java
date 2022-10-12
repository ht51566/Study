package file02_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	
	public static void main(String[] args) throws IOException {
		
		String path = "d:/ace/temp/today.txt";
		File file = new File(path);
		FileReader fr = new FileReader(file);
//		System.out.println((char)fr.read()); //50724 '오'

		char[] buffer = new char[10];
		int readCnt = 0;
		String str = null;
		while((readCnt = fr.read(buffer)) != -1) {
//			System.out.println(buffer); 
//			System.out.println(readCnt); 
			
			str = new String(buffer, 0, readCnt);
			System.out.println(str);
		}
		
		fr.close();
	
	}
}	
