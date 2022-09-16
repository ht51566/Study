package st01_if;

public class If08 {
	public static void main(String[] args) {
		// age 18세 이상, money >=100000 => "you're welcome!"
		// money < 100000 => "you need more money." 용돈 10000원 주기
		// age < 18 => "See you nex~~~t time!!!"
		
		int age = 25;
		int money = 20000;
		
		if(age >= 18) {
			//나이가 18세 이상
			if(money >= 100000) {
				//나이가 18세 이상이고 돈도 많은 때
				System.out.println("you're welcome!");
			}else {
				//나이가 18세 이상이지만 돈이 적을 때
				System.out.println("you need more money.");
				money += 10000;
			}
		}else {
			//나이가 18세 미만
			System.out.println("See you nex~~~t time!!!");
		}
	}
}
