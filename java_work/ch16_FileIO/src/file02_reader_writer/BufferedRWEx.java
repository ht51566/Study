package file02_reader_writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedRWEx {
	
	public static void main(String[] args) throws IOException {
		
		String path = "today.txt";
//		FileReader fr = new FileReader(new File(path));
//		BufferedReader br = new BufferedReader(fr);
		
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		
//		System.out.println((char)br.read());
		String result = null;
		while(true) {
			if((result = br.readLine()) != null) {
				System.out.println(result);
			}else {
				break;
			}
		}
		br.close();
		//fr.close();
		
		System.out.println("------------------------------------");
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader bufferedReader = new BufferedReader(reader);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter(new File("dinner.txt"), true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while(true) {
			System.out.println("input any word >>> ");
			String buffer = bufferedReader.readLine();
			if("exit".equals(buffer)) {
				break;
			}
			bw.write(buffer + "\n");
			bw.flush();
		}
		
		bw.close();
		fw.close();
		bufferedReader.close();
		
		
		
	}
}
