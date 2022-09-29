package api01_Object;

public class CloneEx {
	public static void main(String[] args) {
		
		Clone c1 = new Clone("111", "tom", new int[] {90, 95});
		
		Clone c2 = c1.getClone();
		
		c2.name = "jane";
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("----------------------------------------");
		c2.scores[1] = 88;
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}
	
}
