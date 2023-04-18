package pack04;

public class Rectangle {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		//Object obj=b와 같다
		Rect p=(Rect)obj;
		if(this.width*this.height == p.width*p.height)
			return true;
		else
			return false;
	}
	
}