package innerInterface;

public class MessageListner implements Button.OnclickListner{

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다~~");
	}

}
