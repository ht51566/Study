package interface03;

public interface RemoteControl {
	
	//상수
	//static final int 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void play();
	
	//인터페이스에서 일반 메소드 사용 불가 -> 모든 자식 클래스들이 재정의하지 않고 똑같이 사용하기 위한 메소드 필요 -> default
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	//static method - 인터페이스명.메소드명
	static void changeBattery() {
		System.out.println("리모콘 건전지 교환!!!");
	}
}
