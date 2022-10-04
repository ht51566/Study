package api03_String;

public class Case {
	public static void main(String[] args) {
		String str = "I love you, Baby~~";
		System.out.println(str);
		String upper = str.toUpperCase();
		System.out.println(upper);
		String lower = str.toLowerCase();
		System.err.println(lower);
		System.out.println();
		
		//trim() / concat()
		String let = "        Let it be~   ";
		String speak = "Speaking words of wisdom, ";
		
		System.out.println(speak.concat(let.trim()).toUpperCase().replace("wisdom".toUpperCase(), "demon"));
	}
}
