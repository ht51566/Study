package co04_static;

public class AccEx {
	public static void main(String[] args) {
		
		System.out.println(Accumulator.grandTotal);
		
		Accumulator ac1 = new Accumulator();
		Accumulator ac2 = new Accumulator();
		
		ac1.total = 10;
		System.out.println(ac2.total);
		
		System.out.println(ac1.grandTotal);
		System.out.println(ac2.grandTotal);
		
		ac1.grandTotal += 10;
		System.out.println(ac1.grandTotal);
		System.out.println(ac2.grandTotal);
		System.out.println(Accumulator.grandTotal);
		System.out.println("---------------------------");
		ac1.accumulate(5);
		System.out.println(ac1.total);
		System.out.println(ac2.total);
//		System.out.println(Accumulator.total);
		System.out.println(ac1.grandTotal);
		System.out.println(ac2.grandTotal);
		System.out.println(Accumulator.grandTotal);
		System.out.println("---------------------------");
		ac2.accumulate(3);
		System.out.println(ac1.total);
		System.out.println(ac2.total);
//		System.out.println(Accumulator.total);
		System.out.println(ac1.grandTotal);
		System.out.println(ac2.grandTotal);
		System.out.println(Accumulator.grandTotal);
	}
}
