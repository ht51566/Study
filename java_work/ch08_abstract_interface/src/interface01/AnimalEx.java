package interface01;

public class AnimalEx {
	public static void main(String[] args) {
		
		Animal ani1 = new Dog("뭉개");
		ani1.sound();
		Animal ani2 = new Cat("또양");
		ani2.sound();
		
		//인터페이스 - 설계도 역할, 자식들 같은 타입으로 묶어주는 역할, 자체적으로 생성 불가
		//Animal ani3 = new Animal();
		
		//익명구현 객체 - GUI, Thread 구현할 때 주로 사용
		Animal ani3 = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("익명 객체 변신 완료~~~");
			}
			
			@Override
			public void eat(String food) {
				System.out.println("익명 객체 식사 완료!!!");
			}
		};
		
		Animal[] animals = {ani1, ani2, ani3};
		for(Animal ani : animals) {
			System.out.println("----------------------");
			ani.sound();
			ani.eat("tom");
			
		}
		
	}
}
