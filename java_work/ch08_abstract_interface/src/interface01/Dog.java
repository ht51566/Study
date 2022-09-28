package interface01;

public class Dog implements Animal{
	
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public void sound() {
		System.out.println(OWNER +"의  " + name + "이(가) 멍멍~~");
	}

	@Override
	public void eat(String food) {
		System.out.println(food + "를 맛있게 우걱우걱");
	}
}
