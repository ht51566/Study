package abstract01;

public class Cat extends Animal{

	public Cat(String kind) {
		super(kind);
	}
	
	@Override
	void sound() {
		System.out.println(kind + "이(가) 야옹~~");;
	}

	@Override
	void eat(String food) {
		System.out.println(food + "를 맛있게 야금야금");
	}
}
