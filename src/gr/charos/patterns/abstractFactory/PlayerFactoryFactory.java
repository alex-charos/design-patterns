package gr.charos.patterns.abstractFactory;

public class PlayerFactoryFactory {
	
	public static Player getPlayer(PlayerFactory factory) {
		return  factory.getPlayer();
	}

}
