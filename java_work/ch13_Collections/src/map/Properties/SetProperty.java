package map.Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetProperty {
	
	public static void main(String[] args) {
		
		Properties props = new Properties();
		props.setProperty("점심시간", "1시간");
		props.setProperty("점심메뉴", "갈비탕");
		props.setProperty("점심가격", "5000원");
		props.setProperty("후식", "커피");
		
		System.out.println(props);
		
		try {
			props.store(new FileWriter("lunch.properties"), "점심식사");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
