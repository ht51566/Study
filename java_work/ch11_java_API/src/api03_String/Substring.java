package api03_String;

public class Substring {
	public static void main(String[] args) {
		
		String str = "서울, 21, 부산, 29, 인천, 33";
		System.out.println(str.substring(8));
		System.out.println(str.substring(8, 14));
		System.out.println(str.substring(str.indexOf("부산"), str.indexOf('9')+1));
		
		//replace
		System.out.println(str.replace('울', '뽕'));
		System.out.println(str);
		
		String newStr = str.replace('울', '뽕');
		System.out.println(newStr);
		
		//인천:33
		System.out.println(str.substring(str.indexOf('인')).replace(", ", ":"));
	}
}
