package in01;

public class ColorPointEx {
	public static void main(String args[]) {
		
		Point_ex p = new Point_ex ();		//Point 객체 생성
		p.set(1,2);					//
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
