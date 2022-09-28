package innerInterface;

public class MP3PlayerFactory extends PlayerFactory{

	@Override
	Player createPlayer() {
		return new MP3Player();
	}
	
	class MP3Player implements Player{
		@Override
		public void play(String src) {
			System.out.println(src + "  play~~~");
		}
		@Override
		public void stop() {
			System.out.println("stop");
		}
	}

}
