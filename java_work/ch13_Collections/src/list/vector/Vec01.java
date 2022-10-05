package list.vector;

import java.util.Iterator;
import java.util.Vector;

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Vec01 {
//	벡터는 항상 동기화되는 장점이자 단점을 가지고 있습니다. 
//	스레드가 1개일때도 동기화를 하기 때문에 ArrayList보다 성능이 떨어집니다. 
//	Arraylist는 기본적인 기능은 벡터와 동일하나 자동 동기화 기능이 빠져있고, 동기화 옵션이 존재합니다. 
//	그리고 벡터에 비해 속도가 더 빠르기 때문에 벡터에 비해 많이 쓰이고 있습니다.
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(5);
		
		v.add(1);
		v.add(2);
		v.add(3);
		
		print(v);
		
		v.trimToSize();
		print(v);
		
		v.ensureCapacity(50);
		print(v);
		
		Vector<Integer> v2 = new Vector<>();
		v2 = (Vector<Integer>) v.clone();
		v2.set(1, 100);
		print(v2);
		print(v);
		
		v.clear();
		print(v);
		
		if(v.isEmpty()) {
			System.out.println("비어있군 ㅋㅋㅋ");
		}else {
			System.out.println("뭐가 있나? ");
			System.out.println(v.get(0));
		}
		
		Vector<Student> st = new Vector<>();
		st.add(new Student("tom", 33));
		st.add(new Student("jane", 23));
		
		Vector<Student> st2 = (Vector<Student>) st.clone(); 
						
		print(st);
		print(st2);
		
		st.get(0).age = 99;
		
		print(st);
		print(st2);
		
		for(Student s : st) {
			System.out.println(s);
		}
		System.out.println("-----------------------");
		Iterator<Student> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	private static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: " + v.size());
		System.out.println("capacity: " + v.capacity());
		System.out.println("=================");
	}
	
}
