package co09_dto;

public class Account {
	
	//field : dataset
	private String AccNo;
	private String BankName;
	private String Owner;
	
	//constructor - datarow - record
	public Account(String accNo, String bankName, String owner) {
		super();
		AccNo = accNo;
		BankName = bankName;
		Owner = owner;
	}
	
	//getter & setter
	public String getAccNo() {
		return AccNo;
	}

	public void setAccNo(String accNo) {
		AccNo = accNo;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	@Override
	public String toString() {
		return "Account [AccNo=" + AccNo + ", BankName=" + BankName + ", Owner=" + Owner + "]";
	}
	
}
