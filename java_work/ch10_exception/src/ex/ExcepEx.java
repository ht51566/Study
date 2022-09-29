package ex;

public class ExcepEx {

	public static void main(String[] args) {

		String[] strArray = { "10", "2a" };
		int val = 0;
		// 익셉션 발생과 무관하게 val 값 출력
		for (int i = 0; i <= 2; i++) {
			try {
				val = Integer.parseInt(strArray[i]);
			} catch (NumberFormatException e) {
				System.out.println("정수여야지 >>>");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과 >>>");
			}finally {
				System.out.println(val);
			}
		}
		System.out.println("Program End!!!");
	}
}
