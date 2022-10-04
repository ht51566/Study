package generics_basic;

public class BoxEx {
	public static void main(String[] args) {
		
		Box box = new Box();
		box.setObj("tom");
		box.setObj(new Apple());
		
//		String name = (String) box.getObj();
//		System.out.println(name);
		Apple apple = (Apple) box.getObj();
		System.out.println(apple);
	}
}
