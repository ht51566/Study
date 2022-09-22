package co03_method.ex;

public class AccEx {
	public static void main(String[] args) {
		
		Account ac1 = new Account("111", "ace", 10000);
		Account ac2 = new Account("222", "tom", 5000);
		
		ac1.deposit(5000);
		ac1.withdraw(7000);
		ac1.withdraw(9000);
		ac2.deposit(3000);
		
		ac1.transit(ac2, 5000);
		
		System.out.println(ac1);
		System.out.println(ac1.toString());
		System.out.println(ac2);
	}
}
