package file02_reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
//		File file = new File("d:/ace/temp/today.txt");
		File file = new File("today.txt");
		
		FileWriter writer = new FileWriter(file);
		
		writer.write("오늘은 금요일이네요.\n");
		writer.write("점심 먹어야 겠네요.\n");
		writer.write("저녁엔 등갈비 먹으니까 점심은 패스 ㅋㅋㅋ\n");
		
		writer.flush();
		writer.close();
		System.out.println("파일 출력 완료!!!");
		
		writer = new FileWriter(file, true);
		writer.write("오늘은 즐거운 날 \n");
		
		writer.flush();
		writer.close();
		System.out.println("파일 출력 완료!!!");
	}
}
