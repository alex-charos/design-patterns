package gr.charos.patterns.adapter;

public class Match {
	
	public FootballPitch getPitch() {
		return new FootballPitch(100, 200);
	}

}
