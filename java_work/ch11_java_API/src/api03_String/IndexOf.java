package api03_String;

public class IndexOf {
	public static void main(String[] args) {
		
		String str = "서울, 21, 부산, 29, 인천, 33";
		int index1 = str.indexOf(',');
		System.out.println(index1); //2 - 처음 나오는 ,의 인덱스 값
		index1 = str.indexOf(',', 4); //6 - 4부터 시작해서 처음 나오는 ,의 인덱스값
		System.out.println(index1); 
		
		int index2 = str.indexOf("부산");
		System.out.println(index2);
		
		int index3 = str.lastIndexOf(',');
		System.out.println(index3);
		
		String path = "http://www.daum.net/news/money";
		System.out.println(path.substring(path.lastIndexOf("/")));
		
		String fileName = "what_is.zzz.rer.hwp";
		System.out.println(fileName.substring(path.lastIndexOf(".")));
		if(fileName.substring(fileName.lastIndexOf(".")).equals(".hwp")){
			System.out.println(fileName);
		}else {
			System.out.println("파일 삭제");
		}
	}
}
