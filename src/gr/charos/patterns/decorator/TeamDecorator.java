package gr.charos.patterns.decorator;

public class TeamDecorator implements Team {

	protected Team team;
	
	public TeamDecorator(Team t) {
		this.team = t;
	}
	
	@Override
	public void getPlayers() {
		team.getPlayers();
	}
	

}
