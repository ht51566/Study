package st01_if;

public class If04 {
	public static void main(String[] args) {
		// random으로 점수(score)를 받아 학점(grade) 주기
		// 0~59: F / 60~69:D / 70~79:C / 80~89:B / 90~100:A

		int score = (int) (Math.random() * 100) + 1;
		String grade = "";
		System.out.println(score);

		if (score < 60) {
			grade = "F";
		} else if (score < 70) {
			grade = "D";
		} else if (score < 80) {
			grade = "C";
		} else if (score < 90) {
			grade = "B";
		} else {
			grade = "A";
		}

		System.out.printf("성적은 %d점이고, 학점은 %s입니다.", score, grade);
	}
}
