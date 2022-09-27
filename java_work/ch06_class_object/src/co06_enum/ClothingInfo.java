package co06_enum;

public class ClothingInfo {
	
	String code;
	String name;
	String material;
	//String season;
	Season season;
	
	//public ClothingInfo(String code, String name, String material, String season) {
	public ClothingInfo(String code, String name, String material, Season season) {
		super();
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}

	@Override
	public String toString() {
		return "ClothingInfo [code=" + code + ", name=" + name + ", material=" + material + ", season=" + season + "]";
	}
	
	
	
}
