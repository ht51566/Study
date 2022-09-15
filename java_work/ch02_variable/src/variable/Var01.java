//패키지 선언
package variable;

//변수란? 값을 저장하기 위한 메모리 공간의 이름
//변수 쓰는 이유: 값을 저장해야 하니까, 값의 재활용, 일괄 수정....
//변수명: 대소문자 구분, 숫자로 시작 못함, 영문자, $, _만 가능. 예약어 사용 불가능
//클래스 첫 글자는 항상 대문자, 변수나 메소드 첫 글자는 소문자, 상수는 모두 대문자, CamelCase
public class Var01 {
	public static void main(String[] args) {
		//변수 선언 - 타입 부여
		int num1; //정수형 변수  num1 선언 - 메모리 4byte 공간을 확보
		num1 = 10; //10으로 변수 초기화
		int num2 = 20;
		int num3 = num1 + num2; 
		System.out.println(num1 + " + " + num2 + " = " + num3);
	}
}
