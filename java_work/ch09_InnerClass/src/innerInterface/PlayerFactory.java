package innerInterface;

public abstract class PlayerFactory {
	
	abstract Player createPlayer();
	
	interface Player{
		void play(String src);
		void stop();
	}
}
