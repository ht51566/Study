package ch01_basic;

/***********************
 * javadoc comment: 주석을 문서화할 때 사용
 * 
 * @author 4-002
 * @version 1.2 MIT copyright
 * 
 ***********************/

/*
 * 부분주석(여러 줄 주석) 오늘 자바를 배우기 시작했네 ㅋㅋㅋ 내일이면 나는 자바의 신이 되겠네 ㅋㅋㅋ
 */

// 한 줄 주석: 일반적으로 주석의 대상 윗줄에 주석을 단다
// public: 클래스의 scope - 나중에 배우자
// class: 클래스 선언
// 클래스명: 첫글자- 영어 대문자, $, _ 만 허용. 여러 단어일 경우 CamelCase
//{ } : 클래스 내용(실행문 담는 자리) 
public class Comment {
//main method : 모든 자바 프로그램의 시작점. 유일한 자동 실행 메소드
	// static: 정적, 나중에 배우자
	// void: 실행 결과를 반환 하지 않는 (return 없는) 메소드
	// main: 메소드명- 영어 소문자, camelCase, 예약어, 직접 만드는 메소드에 쓸 수 없다
	// ( ) : 매개변수(parameter) 전달 받는 자리
	// String[] args : 문자열 배열을 매개변수로 전달 받음
	// { } : 메소드 내용 (실행문) 담는 자리
	public static void main(String[] args) {
		// System: 클래스 이름(java.lang 패키지에 포함된 시스템 관련 클래스. )
		// out: 시스템 클래스의 필드
		// println: 시스템 클래스의 메소드명- 매개변수로 받은 문자열 출력
		System.out.println("wow, 딥따시 편하군 ㅋㅋㅋ");

	}
}
