package co03_method.ex;

public class Account {

	// field
	String accNo; // 계좌번호
	String owner; // 예금주
	int balance; // 잔고

	//생성자
	public Account(String accNo, String owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	//method
	
	//예금(deposit) : int money 받아서 잔고 증가: void
	void deposit(int money) {
		balance += money;
		printAccount();
	}
	
	//출금(withdraw): int money 받아서 잔고에서 빼주고 return
	//잔고보다 출금액이  크면 잔고 부족 출력하고 0원 반환
	int withdraw(int money) {
		if(balance < money) {
			System.out.println("잔고 부족");
			printAccount();
			return 0;
		}else {
			balance -= money;
			printAccount();
			return money;
		}
	}
	
	//이체하기 - 받을 계좌, 보낼 금액 받아서 보내는 계좌에서 금액 빼주고 받는 계좌에 금액 더해주고 ~~~)
	void transit(Account a, int money) {
		if(balance < money) {
			System.out.println("잔고 부족");
			printAccount();
		}else {
			this.balance -= money;
			a.balance += money;
			printAccount();		
			printAccount(a);
		}
	}
	
//	@Override
//	public String toString() {
//		return "계좌번호: " + this.accNo + " / 예금주: " + this.owner + " / 잔고: " + this.balance;
//	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", owner=" + owner + ", balance=" + balance + "]";
	}

	
	void printAccount() {
		System.out.println("계좌번호: " + this.accNo);
		System.out.println("예금주: " + this.owner);
		System.out.println("잔고: " + this.balance);
		System.out.println("++++++++++++++++++++++++");
	}
	
	
	void printAccount(Account acc) {
		System.out.println("계좌번호: " + acc.accNo);
		System.out.println("예금주: " + acc.owner);
		System.out.println("잔고: " + acc.balance);
		System.out.println("++++++++++++++++++++++++");
	}
}
