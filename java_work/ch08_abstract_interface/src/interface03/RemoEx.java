package interface03;

public class RemoEx {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.setVolume(17);
		System.out.println("--------------------------");
		RemoteControl rc;
		rc = tv;
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		System.out.println("--------------------------");
		Audio audio = new Audio();
		rc = audio;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		System.out.println("--------------------------");
		Computer computer = new Computer();
		computer.search("꺼져");
		System.out.println("--------------------------");
		SmartTV sm = new SmartTV();
		Searchable[] sc = {computer, sm};
		String url = "w3school";
		for(Searchable searchable : sc) {
			searchable.search(url);
		}
		
		rc = sm;
		rc.setVolume(29);
		rc.turnOff();
		System.out.println("--------------------------");
		rc = audio;
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.turnOff();
		
		
		
		
		
	}
}
