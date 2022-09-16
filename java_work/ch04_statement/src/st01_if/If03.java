package st01_if;

public class If03 {
	public static void main(String[] args) {

		// System.out.println(Math.random());
		// 주사위 굴려서 나온 값 출력

		int num = (int) (Math.random() * 6) + 1;
		System.out.println(num);

	//		if() {
	//		
	//	}else if() {
	//		
	//	}else {
	//		
	//	}
		
		if(num == 1) {
            System.out.println("1번이 나왔다.");
        }else if (num == 2) {
            System.out.println("2번이 나왔다.");
        }else if (num == 3) {
            System.out.println("3번이 나왔다.");
        }else if (num == 4) {
            System.out.println("4번이 나왔다.");
        }else if (num == 5) {
            System.out.println("5번이 나왔다.");
        }else{
            System.out.println("6번이 나왔다.");
        }
		
	}
}
