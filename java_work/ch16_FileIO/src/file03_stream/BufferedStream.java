package file03_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedStream {
	
	public static void main(String[] args) throws IOException {
		
		String origin = "d:/ace/web/images/aa.mp4";
		String target = "d:/ace/temp/aa.mp4";
		
		FileInputStream fis = new FileInputStream(origin);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream(target);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long start = 0, end =0;
		
		int readByte;
		
		byte[] buffer = new byte[100];
		
		start = System.nanoTime();
		while((readByte = fis.read(buffer)) != -1) {
			fos.write(buffer, 0, readByte);
		}
		fos.flush();
		end = System.nanoTime();
		
		System.out.println("No Buffer: " + (end -start) + "나노초");
		System.out.println("------------------------------------");
		
		start = System.nanoTime();
		while((readByte = bis.read()) != -1) {
			bos.write(buffer, 0, readByte);
		}
		bos.flush();
		end = System.nanoTime();
		
		System.out.println("Buffer: " + (end -start) + "나노초");
		
		bos.close();
		bis.close();
		fos.close();
		fis.close();
	}
}
