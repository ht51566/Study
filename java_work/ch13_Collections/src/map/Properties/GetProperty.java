package map.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetProperty {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties();
		
		String path = "db.properties";
		props.load(new FileReader(path));
		System.out.println(props);
		
		String driver = props.getProperty("driver");
		String url = props.getProperty("url");
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
}
