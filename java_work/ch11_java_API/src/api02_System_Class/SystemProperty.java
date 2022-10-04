package api02_System_Class;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemProperty {
	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("file.encoding"));
		System.out.println("===========================================");
		System.out.println("[key] value");
		System.out.println("===========================================");
		Properties props = System.getProperties();
//		System.out.println(props);
		Set keys = props.keySet();
//		System.out.println(keys);
		
		for(Object obj: keys) {
			String key = (String) obj;
			String value = System.getProperty(key);
			System.out.println("["+key+"] " + value);
		}
		
		System.out.println("------------------------------------");
		Map<String, String> env = System.getenv();
		System.out.println(env);
		
		
		
	}
}
