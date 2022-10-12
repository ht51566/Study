package file04_object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService {

	List<GoodInfo> list = new ArrayList<>();
	Map<String, GoodInfo> map = new HashMap<>();

	private static BookService instance;

	private BookService() {
	}

	public static BookService getInstance() {
		if (instance == null) {
			instance = new BookService();
		}
		return instance;
	}
	
	//프로그램 시작 시 데이터 로딩
	public void restore() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("book.dat"));
			while (true) {
				try {
					GoodInfo bi = (BookInfo) ois.readObject();
					// System.out.println(bi);
					list.add(bi);
					map.put(bi.getName(), bi);
				} catch (EOFException e) {
					System.out.println("로딩 완료!!!");
					break;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public int registBook(BookInfo bi) {
		try {
			list.add(bi);
			save();
		}catch(Exception e) {
			return 0;
		}
		return 1;
	}

	public void save() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
			for (GoodInfo gi : list) {
				oos.writeObject(gi);
			}
			oos.flush();

			System.out.println("저장 성공!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public List<GoodInfo> bookList() {
		return list;
	}

}
