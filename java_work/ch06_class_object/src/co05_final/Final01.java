package co05_final;

public class Final01 {
	
	String name;
	//final: 초기값이 최종값인 필드 - 수정 불가
	//final 초기화 방법
	//1)선언하면서 초기화
	final String nationality = "Korea";
	final String idNo;
	
	//2)생성자에서 초기화
	public Final01(String idNo, String name) {
		this.idNo = idNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Final01 [name=" + name + ", nationality=" + nationality + ", idNo=" + idNo + "]";
	}

	public static void main(String[] args) {
		Final01  fi = new Final01("1234", "tom");
		System.out.println("국적: " + fi.nationality);
		System.out.println("주번: " + fi.idNo);
		System.out.println("이름: " + fi.name);
		
//		fi.nationality = "USA";
//		fi.idNo = "4321";
		fi.name = "홍길동";
		
//		System.out.println("국적: " + fi.nationality);
//		System.out.println("주번: " + fi.idNo);
//		System.out.println("이름: " + fi.name);
		
		System.out.println(fi);
		
	}
}
