package gr.charos.patterns.abstractFactory;

public class PremierLeaguePlayerFactory implements PlayerFactory {

	@Override
	public Player getPlayer() {
		return new PremierLeaguePlayer();
	}

}
