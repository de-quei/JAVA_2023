package test;

public class ColorPoint extends Point_ex {

	private String color;		// 점의 색

	public void setColor(String color) {
		this.color = color;		// 멤버변수에 color값을 할당
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
	
}
