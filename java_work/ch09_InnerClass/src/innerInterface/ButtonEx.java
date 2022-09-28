package innerInterface;

public class ButtonEx {
	public static void main(String[] args) {
		
		Button btn = new Button();
		btn.setOnClickListner(new CallListner());
		btn.touch();
		
		btn.setOnClickListner(new MessageListner());
		btn.touch();
		
		btn.setOnClickListner(new SearchListner());
		btn.touch();
		
	
	}
}
