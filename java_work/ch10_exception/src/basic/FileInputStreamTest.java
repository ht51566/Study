package basic;

import java.io.FileNotFoundException;

public class FileInputStreamTest implements AutoCloseable{
	
	private String file;
	
	public FileInputStreamTest(String file) throws FileNotFoundException{
		this.file = file;
	}
	
	void read(){
		System.out.println(file + "을 읽습니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file + "읽는 객체를 닫습니다.");
	}
	
}
