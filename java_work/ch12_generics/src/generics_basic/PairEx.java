package generics_basic;

public class PairEx {
	public static void main(String[] args) {
		
		Pair<String, Integer> p1 = new Pair<String, Integer>("tom", 33);
		Pair<String, Integer> p2 = new Pair<>("tom", 33);
		Pair<String, Integer> p3 = new Pair<>("jane", 33);
		
		System.out.println(Util.compare(p1, p2));
		System.out.println(Util.compare(p1, p3));
	}
}
