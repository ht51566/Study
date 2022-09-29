package user_define;

class Account{
	private long balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long balance) {
		this.balance += balance;
	}
	
	void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고 부족: " + (money-balance) + " 모자람 ㅋㅋㅋ");
		}
		balance -= money;
	}
}


public class AccountEx {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.deposit(10000);
		System.out.println(acc.getBalance());
		try {
			acc.withdraw(20000);
		} catch (BalanceInsufficientException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
		
}
