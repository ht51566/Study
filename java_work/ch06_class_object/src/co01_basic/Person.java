package co01_basic;

// class란? 
// 객체를 정의해 놓은 것 - 객체 생성의 도구 - 객체 찍어내는 틀
// 하나의 data type - 사용자 정의  data type
// data(객체의 특징-속성-필드)와 함수(객체의 행동-메소드)의 결합 
// 표의 한 행을 구성하는 데이터 - 객체
public class Person {
	
	//속성: 클래스로 찍어내는 객체들이 공통적으로 갖는 특징
	//field, attribute, member variable(멤버변수), instance variable(인스턴스 변수)
	String name;
	int age;
	String gender;
	String nationality;
	Car myCar;
	
	//기능: 메소드
	void smile() {
		System.out.println("깔깔깔~~~");
	}
	
	void smile(Person p) {
		System.out.println(p.name + "이 깔깔깔~~~");
	}
		
}
