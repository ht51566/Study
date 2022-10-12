package file03_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInOutStream {
	
	public static void main(String[] args) throws IOException {
		
		String origin = "0.jpg";
		String target = "./copy/apple.jpg";
		
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(target);
		
		int readByte;
		
		byte[] buffer = new byte[100];
		
		while((readByte = fis.read(buffer)) != -1) {
			System.out.println(readByte);
			System.out.println(Arrays.toString(buffer));
			fos.write(buffer, 0, readByte);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("그림 복사 완료!!!");
		
		
	}
}
