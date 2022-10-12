package file04_object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputEx {
	public static void main(String[] args) {
		
		BookInfo b1 = new BookInfo("1111", 20000, "행복", "tom", "158");
		BookInfo b2 = new BookInfo("1112", 25000, "ask", "jane", "218");
		BookInfo b3 = new BookInfo("1113", 33000, "answer", "steve", "313");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
			oos.writeObject(b1);
			oos.writeObject(b2);
			oos.writeObject(b3);
			oos.flush();
			
			System.out.println("저장 성공!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
