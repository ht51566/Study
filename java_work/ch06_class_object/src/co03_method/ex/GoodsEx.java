package co03_method.ex;

public class GoodsEx {
	public static void main(String[] args) {
		Goods apple = new Goods("a1234");
		apple.addStock(100);
		apple.addStock(50);
		apple.subtractStock(70);
		int result = apple.subtractStock(130);
		System.out.println(result);
		
		System.out.println(apple);
	}
}
