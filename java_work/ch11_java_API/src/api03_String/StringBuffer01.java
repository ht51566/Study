package api03_String;

public class StringBuffer01 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hi! ");
		sb.append("my name is coco.");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		String hi = new String(sb);
	}
	
}
