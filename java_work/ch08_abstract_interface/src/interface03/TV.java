package interface03;

public class TV implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println(this + " is on!");
	}
	
	@Override
	public void turnOff() {
		System.out.println(this + " is off!");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if(volume < MIN_VOLUME ) {
			this.volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨: " + this.volume);
	}

	@Override
	public void play() {
		System.out.println(this + " is playing!");
	}
	
	@Override
	public String toString() {
		return "TV";
	}

}
