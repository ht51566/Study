package array;

public class Arr08 {
	public static void main(String[] args) {
		
		String[] myClass = {"강동진","강전후","김정욱","박솔이","박홍도","손예림","신진우",	"양정우","이아현","이은수",
				"이지홍","임호권","전성배","정진범","조영진","진용","채다예","황규성"};
		
		for(String name : myClass) {
			System.out.println(name);
		}
		System.out.println("---------------------");
		for(String name : myClass) {
			if(name.charAt(0) == '김') {
				System.out.println(name + "에게 편지 보냄 ㅋㅋㅋ");
			}
			if(name.endsWith("우")) {
				System.out.println(name + "에게 500원 보냄");
			}
		}
		
		String[][] myClassDivision = {
				{"강동진","정진범"},
				{"전성배","조영진","진용","채다예"},
				{"강전후","김정욱","박솔이"},
				{"신진우"},
				{"양정우","이아현","이은수","박홍도","손예림"},
				{"이지홍","임호권","황규성"}
		};
		
		int teamNumber = 0;
		for(String[] div : myClassDivision) {
			teamNumber++;
			System.out.print(teamNumber + "팀: ");
			for(String name : div) {
				System.out.print(name + ", ");
			}
			System.out.println(": 총 " + div.length+"명");
		}
				

	}
}
