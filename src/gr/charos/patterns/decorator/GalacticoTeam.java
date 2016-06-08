package gr.charos.patterns.decorator;

public class GalacticoTeam extends TeamDecorator {

	public GalacticoTeam(Team t) {
		super(t);
	}
	
	public void getPlayers() {
		team.getPlayers();
		System.out.println(" Adding some galacticos");
		
	}

}
