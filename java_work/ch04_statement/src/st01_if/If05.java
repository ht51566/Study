package st01_if;

public class If05 {
	public static void main(String[] args) {

		// age 0세 이하이면 "천사" 출력
		// age 18세 이상이면 "소주" 출력, 15~17세면 "커피", 15세 미만이면 "우유"
		// 먼저 사람인지 확인하고(age > 0) 사람일 경우에만 나이에 맞는 음료를 추천
		
		int age = 29;
		
		if(age > 0) {
			//중첩 if
			//age가 0보다 큰 경우
			if(age < 15) {
				System.out.println("우유 드셈 ㅋㅋㅋ");
			}else if(age < 18) {
				System.out.println("커피 드셈 ㅋㅋㅋ");
			}else {
				System.out.println("소주 드셈 ㅋㅋㅋ");
			}
		}else {
			System.out.println("you are an angel!!!");
		}
		
	}

}
