package in12;

public interface Sound {				//인터페이스는 태생 자체가 추상메소드만 작성
	public void SoundUp(int level);		//추상메소드
	public void SoundDown(int level);
//	public void SoundStop() {
//		System.out.println("Stop!");
//	}
	//일반 메소드를 작성하면 오류발생
}
