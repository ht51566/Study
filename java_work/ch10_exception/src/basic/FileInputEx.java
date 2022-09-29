package basic;

import java.io.FileNotFoundException;

public class FileInputEx {
	public static void main(String[] args) throws Exception {
		
		//try~with~resources 구문 
		//try()에 IOException 발생 구문을 넣어주면 익셉션 발생과 무관하게 try 블록 빠져나가면서 입출력 객체 닫아줌  
//		FileInputStreamTest fis = null;
//		try {
//			fis = new FileInputStreamTest("file.txt");
		try(FileInputStreamTest fis = new FileInputStreamTest("file.txt")){
			fis.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*finally {
			try {
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}*/
	}
}
