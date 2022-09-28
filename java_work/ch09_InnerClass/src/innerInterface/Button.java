package innerInterface;

public class Button {
	
	OnclickListner listner;
	
	void setOnClickListner(OnclickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
	
	interface OnclickListner{
		void onClick();
	}
}
