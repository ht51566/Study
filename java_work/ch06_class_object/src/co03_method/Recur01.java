package co03_method;

//재귀함수: 함수 내에서 자기 자신을 다시 호출 //StackOverflowError - 메모리 부하가 크므로 함부로 사용하지 말 것
class Greeting{
	void greet(int x) {
		System.out.println("h1, I'm " + x);
		if(x < 1) {
			return; //method가 return 만나면 종료
		}
		greet(--x); 
	}
}


public class Recur01 {
	
	public static void main(String[] args) {
		Greeting gr = new Greeting();
		gr.greet(10000);
	}
}
