package co02_constructor;

public class ScoreEx {
	public static void main(String[] args) {
		
		Score s1 = new Score();
		Score s2 = new Score(83);
		Score s3 = new Score(83, 92);
		Score s4 = new Score(89, 72);
		Score s5 = new Score("ace", 99, 81, 72);
		Score s6 = new Score(89, 72, 91, "tom");
		
		s5.display();
		s5.display("ㅇ러닝럼나ㅓㄹ");
	}
}
