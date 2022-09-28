package innerInterface;

import innerInterface.PlayerFactory.Player;

public class PlayEx {
	public static void main(String[] args) {
		
		PlayerFactory factory = new MP3PlayerFactory();
		
		Player player = factory.createPlayer();
		System.out.println(player.getClass());
		player.play("hey hey hey");
		player.stop();
	}
}
