package in12;

public class TV implements Sound{
	private int SoundLev;
	public TV() {
		SoundLev = 0;
	}
	@Override
	public void SoundUp(int level) {
		SoundLev += level;
		System.out.println("TV Volume " + level + " Up!");
	}
	@Override
	public void SoundDown(int level) {
		SoundLev -= level;
		if(SoundLev < 0) {
			SoundLev = 0;
		}
		System.out.println("TV Volume " + level + " Down!");
	}
	
	
}



