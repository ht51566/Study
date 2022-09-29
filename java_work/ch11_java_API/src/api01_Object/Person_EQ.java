package api01_Object;

class Person{
	String id;
	String name;
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			return this.id.equals(((Person)obj).id);
		}else {
			return false;
		}
	}
}

class Animal{
	String kind;
	String name;
	public Animal(String kind, String name) {
		super();
		this.kind = kind;
		this.name = name;
	}
	
	//객체 비교를 위한 기준 만들기 - hashcode, toString 오버라이드
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class Person_EQ {
	public static void main(String[] args) {
		Person p1 = new Person("111", "tom");
		Person p2 = new Person("111", "sam");
		Person p3 = new Person("333", "tom");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		if(p1.equals(p2)) {
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		}
		if(p1.equals(p3)) {
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		}
		
		Animal ani1 = new Animal("고양이", "야옹");
		Animal ani2 = new Animal("고양이", "탱굴");
		Animal ani3 = new Animal("강아지", "야옹");
		Animal ani4 = new Animal("고양이", "야옹");
		
		System.out.println(ani1.equals(ani2));
		System.out.println(ani1.equals(ani3));
		System.out.println(ani1.equals(ani4));
		
		System.out.println(ani1.hashCode());
		
	}
}
