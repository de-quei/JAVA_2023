package in11;

public class SmartPhone extends PDA implements MobliePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("따 르 릉");
	}
	@Override
	public void receiveCall() {
		System.out.println("전 화 받 아!");
	}
	@Override
	public void sendSMS() {
		System.out.println("문 자 갑 니 다~");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문 자 왔 어 요!");
	}
	@Override
	public void play() {
		System.out.println("음 악 재 생 중 . . .");
	}
	@Override
	public void stop() {
		System.out.println("음 악 S T O P!");
	}
	
	// 추가 메소드 (일반메소드)
	public void Schedule() {
		System.out.println("일 정 관 리");
	}
	
}
