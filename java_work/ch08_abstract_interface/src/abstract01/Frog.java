package abstract01;

public class Frog extends Animal{

	public Frog(String kind) {
		super(kind);
	}
	
	@Override
	void sound() {
		System.out.println(kind + "이(가) 개굴~~");;
	}

	@Override
	void eat(String food) {
		System.out.println(food + "를 맛있게 낼름");
	}
}
