package pack04;

public class equalsEx {

	public static void main(String[] args) {
		Rectangle a=new Rectangle(2,3);
		Rectangle b=new Rectangle(3,2);
		Rectangle c=new Rectangle(3,4);
		
		if(a.equals(b))
			System.out.println("a is equals to b");
		if(a.equals(c))
			System.out.println("a is equals to c");
		if(b.equals(c))
			System.out.println("b is equals to c");
	}

}
