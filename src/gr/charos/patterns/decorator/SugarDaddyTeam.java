package gr.charos.patterns.decorator;

public class SugarDaddyTeam extends TeamDecorator {

	public SugarDaddyTeam(Team t) {
		super(t);
	}
	
	@Override
	public void getPlayers() {
		team.getPlayers();
		System.out.println("Adding Sugar Daddy...");
	}

}
