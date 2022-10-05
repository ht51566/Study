package set.HashSet;

import java.util.HashSet;

class Car{
	String color;
	int door;
	
	public Car(String color, int door) {
		super();
		this.color = color;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", door=" + door + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		if(this.color.equals(((Car)obj).color)) {
//			return true;
//		}else {
//			return false;
//		}
		
		return this.color.equals(((Car)obj).color);
	}
	
	@Override
	public int hashCode() {
		System.out.println(color.hashCode());
		return color.hashCode();
	}
}


public class HS02 {
	public static void main(String[] args) {
		HashSet  hs = new HashSet<>();
		
		hs.add("abc");
		hs.add("abc");
		hs.add(new Car("red", 2));
		hs.add(new Car("red", 2));
		
		System.out.println(hs);
		System.out.println(hs.size());
	}
}
