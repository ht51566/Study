package api06_format;

import java.text.MessageFormat;

public class MessageFormatEx {
	public static void main(String[] args) {
		
		String id = "java";
		String name = "spark";
		String tel = "000-111-2222";
		int age = 19;

		String result = "id: " + id + " / name: " + name + " / tel: " + tel;
		System.out.println(result);
		System.out.printf("id: %s / name: %s / tel: %s\n",id, name, tel);
		
		System.out.println(MessageFormat.format("id: {0} / name: {1} / tel: {2}\n", id, name, tel));
	}
}
