package co01_basic;

public class AnimalEx {
	public static void main(String[] args) {
		
		Animal ani1 = new Animal();
		ani1.kind = "강아지";
		ani1.name = "띵띵";
		ani1.legNum = 4;
		ani1.run();
		
		Animal ani2 = new Animal();
		ani2.kind = "고양이";
		ani2.name = "핑핑";
		ani2.legNum = 4;
		ani2.run();
		
		Animal ani3 = new Animal();
		ani3.kind = "오골계";
		ani3.name = "치킨";
		ani3.legNum = 2;
		ani3.run();
		System.out.println("----------------------");
		Animal[] ani = {ani1, ani2, ani3};
		for(Animal a : ani) {
			if(a.legNum == 4) {
				a.run();
			}else {
				System.out.println(a.name + "를 맛있게 냠냠");
			}
			
		}
	}
}
