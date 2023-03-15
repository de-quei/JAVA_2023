package test;

public class ColorPointEx {
	public static void main(String args[]) {
		
		Point_ex p = new Point_ex ();		//Point 객체 생성
		// p.x = 5;  --> 접근제어자 private!!
		p.set(1,2);	
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
