package abstract01;

public class Dog extends Animal{

	public Dog(String kind) {
		super(kind);
	}
	
	@Override
	void sound() {
		System.out.println(kind + "이(가) 멍멍~~");;
	}

	@Override
	void eat(String food) {
		System.out.println(food + "를 맛있게 우걱우걱");
	}
}
