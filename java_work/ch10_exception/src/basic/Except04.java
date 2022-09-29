package basic;

public class Except04 {
	public static void main(String[] args) {
		
		//메소드를 호출한 쪽으로 익셉션이 날아오면 여기서 try~catch
		try {
			System.out.println(findClass());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program End");
	}
	
	
	private static Object findClass() throws ClassNotFoundException {
//		Class cls = null;
//		try {
//			cls = Class.forName("java.lang.Strin");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//ClassNotFoundException이 발생하면 메소드를 호출한 쪽으로 떠넘김
		Class cls = Class.forName("java.lang.Strin");
		return cls;
	}
}
