package file04_object;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputEX {
	
	public static void main(String[] args) {
		
		List<GoodInfo> list = new ArrayList<>();
		Map<String, GoodInfo> map = new HashMap<>();
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("book.dat"));
			
			while(true) {
				try {
					GoodInfo bi = (BookInfo) ois.readObject();
					//System.out.println(bi);
					list.add(bi);
					map.put(bi.getName(), bi);
				}catch(EOFException e) {
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
		}finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(GoodInfo g : list) {
			System.out.println(g);
		}
		System.out.println("-----------------");
		System.out.println(map);
		System.out.println("-----------------");
		
		
	}
}
