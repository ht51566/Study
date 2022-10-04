package api03_String;

public class StringBuilder01 {
	
	public static void main(String[] args) {
		
		//새로운 문자열을 만들지 않고 문자열 변경 - 메모리 부하가 적다
		StringBuilder sb = new StringBuilder();
		System.out.println("buffer: " + sb.capacity());
		sb = new StringBuilder("JAVA");
		System.out.println("buffer: " + sb.capacity());
		System.out.println(sb);
		
		sb.append(" King");
		System.out.println(sb);
		System.out.println("buffer: " + sb.capacity());
		
		sb.setCharAt(5, 'k');
		System.out.println(sb);
		
		sb.insert(5, "of ");
		System.out.println(sb);
		
		sb.replace(0, 4, "Love");
		System.out.println(sb);
		
		sb.delete(5, 8);
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println("buffer: " + sb.capacity());
		sb.trimToSize();
		System.out.println("buffer: " + sb.capacity());
	}
}
