package co03_method;

public class Computer {

	boolean power;
	String owner;

	public Computer() {
	}

	public Computer(String owner) {
		this.owner = owner;
	}

	void powerOn() {
		this.power = true;
	}

	void powerOff() {
		this.power = false;
	}

	void search(String url) {
		System.out.println(url + " 검색 시작");
	}

	// 컴퓨터 소유자의 이름 반환 메소드
	String whooseCom() {
		if(this.power) {
			return owner;
		}else {
			return null;
		}
	}

}
