package polymorphism.product;

public class Customer {
	
	int money = 1000;
	int bonuspoint;
	//구매 물품 목록
	Product[] list = new Product[10];
	//int index;
	
	//매개변수의 다형성
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("돈이 부족하넹~~");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		for(int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				list[i] = p;
				break;
			}
		}
		//list[index++] = p;
		System.out.println(p + "를 샀네 ㅋㅋㅋ~~");
		System.out.println(money + " : " + bonuspoint );
	}
		
	//반품
	void refund(Product p) {
		for(int i = 0; i < list.length; i++) {
			if(p == list[i]) {
				list[i] = null;
				money += p.price;
				bonuspoint -= p.bonuspoint;
				System.out.println(p + " 반품 완료~");
				System.out.println(money + " : " + bonuspoint );
				return;
			}
		}
		System.out.println("물품 구매 이력이 없습니다");
	}
	
	//구매 목록
	void purchaseList() {
		int sum = 0, cnt = 0; 
		for(Product p : list) {
			if(p != null) {
				sum += p.price;
				cnt++;
				System.out.println("-------------------------------");
				System.out.printf("구입 품목: %10s, 구입액: %d\n", p, p.price);
				
			}
		}
		System.out.println("=================================");
		System.out.printf("총 수량: %10d, 총구입액: %d\n", cnt, sum);
	}
}
