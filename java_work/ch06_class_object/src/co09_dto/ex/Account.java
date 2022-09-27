package co09_dto.ex;

//계좌 정보 DTO
public class Account {
	
	/*field*/
	private String accountNo;
	private String owner;
	private String pwd;
	private long balance;
	
	public Account(String accountNo, String owner, String pwd, long balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.pwd = pwd;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", owner=" + owner + ", pwd=" + pwd + ", balance=" + balance + "]";
	}
	
	
}
