package co09_dto;

import java.util.Scanner;

//DTO: Data Transfer Object - 데이터를 담아서 전달하기 위해 오브젝트로 찍어내는 클래스
//VO: value object
public class Person {
	
	//field - private - encapsulation - 캡슐화
	private String name;
	private String addr;
	private int age;
	private boolean login;
	//private String phone;
	
	//생성자
	public Person() {
	}
	
	public Person(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	//private 필드에 접근하기 위한 방법 - getter & setter
	public String getName() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("암호 >>>");
//		int amho = sc.nextInt();
//		if(amho != 12) {
//			return null;
//		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 12) {
			return;
		}
		this.age = age;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + ", login=" + login + "]";
	}

	

}
