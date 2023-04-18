package pack03;

public class equalsEx {

	public static void main(String[] args) {
		Point a=new Point(2,3); //각각의 a,b,c 객체 생성
		Point b=new Point(2,3); 
		Point c=new Point(3,4);

		if(a==b) //a와 b가 가리키는 객체의 주소가 다르므로 false
			System.out.println("a==b");
		if(a.equals(b))
			System.out.println("a is equals to b");
		if(a.equals(c))
			System.out.println("a is equals to c");
	}

}