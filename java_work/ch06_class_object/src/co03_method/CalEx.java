package co03_method;

public class CalEx {
	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator("전성배");
		Calculator cal2 = new Calculator("박솔이");
		
		cal1.powerOn();
		cal1.plus(33, 22);
		System.out.println(cal1.memory);
		cal1.powerOff();
		cal1.plus(27, 93);
		System.out.println(cal1.memory);
		
		cal2.powerOn();
		System.out.println(cal2.memory);
		cal2.minus(41, 12); //메소드 호출 했으나 반환값을 받지 않아서 쓰레기장으로 날아갔음
		System.out.println(cal2.minus(5, 2));
		int result = cal2.minus(9, 3);
		System.out.println(result);
		System.out.println(cal2.memory);
		cal2.resetMemory();
		System.out.println(cal2.memory);
		
		cal2.multi(5, 8);
		System.out.println(cal2.devide(93, 3));
	}
}
