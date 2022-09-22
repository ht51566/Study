package co03_method;

public class ComputerEx {
	public static void main(String[] args) {

		Computer com1 = new Computer();
		com1.owner = "ace";
		com1.powerOn();
		System.out.println(com1.power);
		com1.search("google");

		// 본인 컴퓨터 만들기(매개변수)
		Computer com2 = new Computer("kang");
		// 전원 켜고, 누구 컴퓨턴지 묻기
		//com2.powerOn();
		System.out.println(com2.power);
		String owner = com2.whooseCom();
		System.out.println(owner);

	}
}
