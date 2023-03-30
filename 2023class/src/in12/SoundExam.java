package in12;

public class SoundExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//interface는 객체 생성을 할 수 없다.
		// Sound tv = new Sound(); 
		
		Sound tv = new TV();	// 업캐스팅
		//tv는 Sound interface를 가리키는 객체변수이지만 TV클래스를 할당
		
		Sound radio = new Radio();
		// radio는 Sound interface를 가리키는 객체변수이지만 Radio클래스를 할당
		
		//tv 객체변수는 TV클래스에 있는 재정의된 SoundUp()메소드를 호출
		tv.SoundUp(5);
		tv.SoundDown(10);
		
		//radio 객체변수는 TV클래스에 있는 재정의된 SoundUp()메소드를 호출
		radio.SoundUp(5);
	}

}
