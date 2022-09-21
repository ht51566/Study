package st02_switch;

public class Sw04 {
	public static void main(String[] args) {
		
		//일부러 break 안 쓰고 권한 범위를 지정
		
		String level = "admin";
		
		switch(level) {
		case "admin": //관리자 - 모든 권한
			grantDetete();
		case "member": //회원 - 읽기, 쓰기 권한
			grantWrite();
		default:
			grantRead();
		}
	}

	private static void grantRead() {
		System.out.println("읽기 가능");
	}

	private static void grantWrite() {
		System.out.println("쓰기 가능");
	}

	private static void grantDetete() {
		System.out.println("삭제 가능");
	}
}
