package co03_method;

//재귀 - recurrection
public class Recur02 {
	public static void main(String[] args) {
		
		long result = factorial(20);
		System.out.println(result);
	}

	private static long factorial(int i) {
		long result = 0;
		if(i == 1) {
			result = 1;
		}else {
			result = i * factorial(i-1);
		}
		return result;
	}
}
