package co06_enum;

public class Cloth {
	
	ClothingInfo ci;
	int price;
	
	public Cloth(ClothingInfo ci, int price) {
		super();
		this.ci = ci;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cloth [ci=" + ci + ", price=" + price + "]";
	}
	
	
}
