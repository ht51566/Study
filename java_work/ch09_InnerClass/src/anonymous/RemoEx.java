package anonymous;

public class RemoEx {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("On!!");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Off!!");
			}
		};
		
		rc.turnOn();
		rc.turnOff();
	}
}
