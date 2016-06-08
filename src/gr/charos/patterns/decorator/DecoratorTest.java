package gr.charos.patterns.decorator;

public class DecoratorTest {
	
	public static void main(String args[]) {
		Team t = new GalacticoTeam(new SugarDaddyTeam( new SimpleTeam()));
		t.getPlayers();
	}

}
