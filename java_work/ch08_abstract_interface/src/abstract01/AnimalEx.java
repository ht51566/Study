package abstract01;

public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog("푸들");
		dog.breathe();
		dog.sound();
		dog.eat("사람");
		
		Cat cat = new Cat("히말라얀스노우플레이크");
		cat.breathe();
		cat.sound();
		cat.eat("공룡");
		
		Frog frog = new Frog("청개구리");
		frog.breathe();
		frog.sound();
		frog.eat("사자");
		
		//추상 클래스 생성 불가
		//Animal animal = new Animal("monster");
		
		System.out.println("------------------------------");
		
		Animal[] ani = {dog, cat, frog};
		for(Animal a : ani) {
			a.breathe();
			a.sound();
			a.eat("삼겹살");
			System.out.println("---------------------------");
		}
		
	}
	
}
