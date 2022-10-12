package lambda;

public class StringConcatEx {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl sci = new StringConcatImpl();
		sci.makeString(s1, s2);
		
		StringConcat sc = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		}; 
		sc.makeString(s1, s2);
		
		StringConcat sc2 = (a, b) -> System.out.println(a + " * " + b);
		sc2.makeString(s1, s2);
	}
}
