package in12;

public class Radio implements Sound{
	private int SoundLev;
	public Radio() {
		SoundLev = 0;
	}
	@Override
	public void SoundUp(int level) {
		SoundLev += level;
		System.out.println("Radio Volume " + level + " Up!");
	}
	@Override
	public void SoundDown(int level) {
		SoundLev -= level;
		if(SoundLev < 0) {
			SoundLev = 0;
		}
		System.out.println("Radio Volume " + level + " Down!");
	}
	
	
}
