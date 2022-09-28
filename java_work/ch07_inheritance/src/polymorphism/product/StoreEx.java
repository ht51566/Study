package polymorphism.product;

public class StoreEx {
	public static void main(String[] args) {
		Customer ct = new Customer();
		ct.buy(new TV());
		ct.buy(new Computer());
		ct.purchaseList();
		TV tv1 = new TV();
		ct.buy(tv1);
		ct.purchaseList();
		ct.refund(tv1);
		ct.purchaseList();
		ct.buy(new Notebook());
		ct.purchaseList();
	}
}
