package co03_method.ex;

public class Goods {
	
	String goodsCode; //상품 코드
	int stockNum; //재고 수량
	
	public Goods(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	
	//매개변수  amount를 받아서 재고에 수량 추가하고 해당 상품코드와 재고수량 출력
	void addStock(int amount) {
		this.stockNum += amount;
		System.out.printf("상품코드: %s, 입고수량: %d, 재고수량: %d\n", goodsCode, amount, stockNum);
		System.out.println("---------------------------");
	}
	
	//매개변수  amount를 받아서 재고에 요구 수량 이상이 있으면 요구 수량 반환하고 재고에서 빼줌 - 남은 재고량 출력
	//재고가 충분하지 않으면 재고를 0으로 하고 있는 만큼 반환
	int subtractStock(int amount) {
		if(stockNum >= amount) {
			stockNum -= amount;
			System.out.printf("상품코드: %s, 출고수량: %d, 재고수량: %d\n", goodsCode, amount, stockNum);
			System.out.println("---------------------------");
			return amount;
		}else {
			int box = stockNum;
			stockNum = 0;
			System.out.printf("상품코드: %s, 출고수량: %d, 재고수량: %d\n", goodsCode, box, stockNum);
			System.out.println("---------------------------");
			return box;
		}
		
	}

	@Override
	public String toString() {
		return "Goods [goodsCode=" + goodsCode + ", stockNum=" + stockNum + "]";
	}
	
	
}
