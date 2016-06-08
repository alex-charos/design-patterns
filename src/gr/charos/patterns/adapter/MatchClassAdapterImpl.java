package gr.charos.patterns.adapter;

public class MatchClassAdapterImpl extends Match implements MatchAdapter{

	@Override
	public FootballPitch getPitchRegular() {
		
		return getPitch();
	}

	@Override
	public FootballPitch getPitchSmall() {
		 
		return new FootballPitch(20, 30);
	}

	@Override
	public FootballPitch getPitchLarge() {
		 
		return new FootballPitch(1000, 2000);
	}
	
	
	

}
