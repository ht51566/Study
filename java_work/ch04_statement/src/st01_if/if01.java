package st01_if;

public class If01 {
	/*
	//if문: 프로그램의 진행 방향을 바꿔주는 효과
	
	if(조건식/값) {
		조건이 참일 때 수행할 명령
	}else {
		조건이 거짓일 때 수행할 명령
	}
	*/
	public static void main(String[] args) {
		
		System.out.println("program start");
		
		int a = 2;
		if(a == 2) {
			System.out.println("쉬는 시간입니다.");
			System.out.println("조건 true일 때 실행");
		}else {
			System.out.println("쉬지 않고 계속 공부합니다.");
			System.out.println("조건 false일 때 실행");
		}
		
		System.out.println("program end");
	}

}
