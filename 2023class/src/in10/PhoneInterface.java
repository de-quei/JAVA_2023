package in10;

public interface PhoneInterface {
	final int TIMEOUT = 10000;	//상수 (public static final이 생략)
	void sendCall();			//추상메서드 (abstract 키워드 생략)
	void receiveCall();			//추상메서드 (abstract 키워드 생략)
	default void printLogo() {	// 개발자들의 요청에 의해서 oracle에서 기능 추가
		System.out.println("**Phone**");
	}
}
