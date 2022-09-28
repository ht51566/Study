package innerInterface;

public class CallListner implements Button.OnclickListner{

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다~~");
	}

}
