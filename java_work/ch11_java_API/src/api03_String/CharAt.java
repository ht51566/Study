package api03_String;

public class CharAt {
	public static void main(String[] args) {
		
		String str = "We are the Champions!";
		String str2 = "I love You! I love You!";
		System.out.println(str);
		
		for(int i =0; i < str.length(); i+=2) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		for(int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		for(int i =0; i < str.length(); i++) {
			if(i%2==1) {
				System.out.print(str.charAt(i));
			}else {
				System.out.print('*');
				System.out.print(str2.charAt(i));
			}
		}
	}
}
