package st05_break_continue;

public class Breco03 {
	public static void main(String[] args) {
		// 주사위 굴려서 6 - 5가 연달아 나오면 종료, 안 나오면 다시 처음으로 올리기
		// 몇번만에 나왔는지 처음 나온 횟수만 횟수로 치세요? 몇 번 시도했는지
		
		int num, times = 0;
		
		while(true) {
			
			num = (int) (Math.random() * 6) + 1;
			times++;
			System.out.printf("1번 - %d - ", num);
			if(num == 6) {
				num = (int) (Math.random() * 6) + 1;
				System.out.printf("2번 - %d", num);
				if(num == 5) {
					break;
				}
			}
						
			System.out.println();
		}
		System.out.println();
		System.out.println(times + "번에 성공");
		System.err.println("Program End!!!");
		
	}
}
