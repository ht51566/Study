package co09_dto.ex;


public class AccountKr extends Account{
	
	private String phone;
	private String address;
	
	public AccountKr(String accountNo, String owner, String pwd, long balance, String phone, String address) {
		super(accountNo, owner, pwd, balance);
		this.phone = phone;
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AccountKr [phone=" + phone + ", address=" + address + ", getAccountNo()=" + getAccountNo()
				+ ", getOwner()=" + getOwner() + ", getPwd()=" + getPwd() + ", getBalance()=" + getBalance()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	} 
	
	
	
	
}
