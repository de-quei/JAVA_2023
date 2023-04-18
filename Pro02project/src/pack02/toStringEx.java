package pack02;

public class toStringEx {

	public static void main(String[] args) {
		Point p=new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p); //.toString() 생략
		System.out.println(p+"입니다");

	}

}