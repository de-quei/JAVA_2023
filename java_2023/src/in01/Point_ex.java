package in01;

public class Point_ex {
	
	private int x, y;				// 한 점을 구성하는 x, y 좌표
	
	public void set(int x, int y) {	// x,y는 스택영역에 저장
		// 메소드 실행이 종료되면 x,y 변수는 사라진다.
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {		// 점의 좌표를 출력
		System.out.println("( " + x + ", " + y + " )");
	}
	
}
