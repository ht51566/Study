package co02_constructor;

public class Score {
	
	//field
	String name;
	int kor;
	int eng;
	int math;

	//생성자: 매개변수의 개수, 데이터타입, 순서로 구분하는 방식 - overloading
	public Score() {}
	public Score(int kor) {
		this.kor = kor;
	}
	public Score(String name) {
		this.name = name;
	}
	public Score(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
//	매개변수 2개짜리 생성자 - 위의 생성자와 매개변수 개수와 데이터타입이 같아서 사용 불가
//	public Score(int kor, int math) {
//		this.kor = kor;
//		this.math = math;
//	}
	public Score(String name, int eng) {
		this.name = name;
		this.eng = eng;
	}
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Score(int kor, int eng, int math, String name) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//method: 이름이 같아도 매개변수의 개수, 타입, 순서로 구분 - 메소드 오버로딩
	void display() {
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", kor, eng, math);
	}
	void display(String name) {
		System.out.printf("%s를 좋아하는 %s의 성적 => 국어: %d, 영어: %d, 수학: %d\n", name, this.name, kor, eng, math);
	}
}
