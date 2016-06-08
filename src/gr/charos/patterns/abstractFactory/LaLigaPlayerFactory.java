package gr.charos.patterns.abstractFactory;

public class LaLigaPlayerFactory implements PlayerFactory {

	@Override
	public Player getPlayer() {
		 
		return new LaLigaPlayer();
	}

}
