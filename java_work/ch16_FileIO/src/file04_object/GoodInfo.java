package file04_object;

import java.io.Serializable;

public class GoodInfo implements Serializable{

	private static final long serialVersionUID = 1L;

	//static, transient : Serializable에서 제외됨
//	static int totalAmount;
//	transient String code; 
	private String code;
	private int price;
	private String name;
	
	public GoodInfo() {}
	public GoodInfo(String code, int price, String name) {
		super();
//		totalAmount++;
		this.code = code;
		this.price = price;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
