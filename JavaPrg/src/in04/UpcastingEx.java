package in04;

public class UpcastingEx {
	//upcasting = 자동형변환

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("이재문");
		Person p;
		p = s;		//업캐스팅
		//p는 person클래스를 가리키는 객체변수이고
		//p는 s객체를 할당받음
		//
		
		System.out.println(p.name);
		
		p.grade = "A";
		p.department = "Com";
	}

}
