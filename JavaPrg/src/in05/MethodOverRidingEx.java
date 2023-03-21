package in05;

public class MethodOverRidingEx {
	
	static void paint(Shape p) {
		p.draw();	// paint(Line);에서 호툴되었을때 draw()메소드는 Line클래스에 있는 메소드
		//p.draw2(); //재정의 x 메소드 접근불가
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		//paint(line);	// paint(Shape p)메소드를 호출하는데 Shape p = line문장과 같음
		
		Shape p = line;
		p.a = 234;
		p.b = 345.78;
		p.shapedraw(); p.draw(); //p는 Shape클래스의 모든 멤버의 접근할 수 있는데 오버라이딩된 메소드는 하위 클래스의 메소드를 호출
//		paint (new Shape());
//		paint (new Line());
//		paint (new Rectangle());
//		paint (new Circle());
	}

}
