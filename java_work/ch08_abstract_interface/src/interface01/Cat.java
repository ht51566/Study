package interface01;

public class Cat implements Animal{
	
	String name;
	
	public Cat(String name) {
		this.name = name; 
	}

	@Override
	public void sound() {
		System.out.println(OWNER +"의  " + name + "이(가) 야옹~~");
	}

	@Override
	public void eat(String food) {
		System.out.println(food + "를 맛있게 야금야금");
	}

}
