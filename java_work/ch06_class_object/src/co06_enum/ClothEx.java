package co06_enum;

public class ClothEx {
	public static void main(String[] args) {
		
//		ClothingInfo ci1 = new ClothingInfo("111", "sweater", "wool", "winter");
//		ClothingInfo ci2 = new ClothingInfo("222", "pants", "jean", "summer");
//		ClothingInfo ci3 = new ClothingInfo("333", "cap", "poly", "Summer");
		
		
		ClothingInfo ci1 = new ClothingInfo("111", "sweater", "wool", Season.WINTER);
		ClothingInfo ci2 = new ClothingInfo("222", "pants", "jean", Season.SUMMER);
		ClothingInfo ci3 = new ClothingInfo("333", "cap", "poly", Season.SUMMER);
		
		Cloth c1 = new Cloth(ci1, 30000);
		Cloth c2 = new Cloth(ci2, 15000);
		Cloth c3 = new Cloth(ci3, 13000);
		Cloth c4 = new Cloth(ci2, 42000);
		
		Cloth[] clothList = {c1, c2, c3, c4};
		
		for(Cloth c : clothList) {
			//if(c.ci.season.equals("summer")) {
			if(c.ci.season == Season.SUMMER) {
				System.out.println(c);
			}
		}
		
	}
}
