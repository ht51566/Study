package co03_method;

public class ParameterEx {
	public static void main(String[] args) {
		
		Parameter pm = new Parameter();
		
		int result = pm.sum1(5, 55);
		System.out.println(result);
		
		//System.out.println(pm.sum1(77));
		//System.out.println(pm.sum1(77, 129, 543));
		
		int[] values = {12, 45, 67, 87, 99, 43, 64, 91, 32423};
		result = pm.sum1(values);
		System.out.println(result);
		System.out.println(pm.sum1(new int[] {33,44,55,66,77}));
		
		result = pm.sum2(values);
		System.out.println(result);
		System.out.println(pm.sum2(11,22,33,44,55,66,77,88,99));
		
		String[] myClass = {"강동진","강전후","김정욱","박솔이","박홍도","손예림","신진우",	"양정우","이아현","이은수",
				"이지홍","임호권","전성배","정진범","조영진","진용","채다예","황규성"};
		
		pm.prize(myClass);
		
		pm.prize("강동진","박솔이","조영진","채다예","황규성", "이지홍");
	}
}
