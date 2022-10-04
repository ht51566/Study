package generics_basic;

public class BoxGenEx {
	public static void main(String[] args) {
		
		BoxGen<String> bg = new BoxGen<>();
		
		//bg.setObj(new Apple());
		bg.setObj("tom");
		System.out.println(bg.getObj());
		
		BoxGen<Apple> aGen = new BoxGen<>();
		aGen.setObj(new Apple());
		
	}
}
