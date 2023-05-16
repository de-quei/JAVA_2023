package file01;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		//fin은 FileReader클래스를 가리키는 객체변수로 할당된 메모리는 없음
		//FileReader fin = new FileReader("C:\\Windows.system.ini");
		
		try { // 파일 입출력에 관계되는 모든 프로그램은 try ~ catch문을 사용해야 한다.
			//try~catch 안에 있는 것을 실행하다가 오류가 발생하면 catch를 실행하고
			//만약에 오류가 없다면 catch문장은 실행하지 않는다.
			fin = new FileReader("C:\\Windows\\system.ini");
			int c;
			//fin이 가리키는 파일(system.ini)에서 한 문자씩 읽어서 c에 저장하고
			//fin객체변수가 파일의 끝에 도달하면 -1의 값을 c에게 넘겨준다.
			//반환하면 파일의 끝까지 읽어서 화면에 출력한다.
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
				//c의 값은 정수형이기 때문에 char형으로 형변환해서 출력해야 한다.
			}
			fin.close();
			//파일을 닫아준다. fin객체변수를 더 이상 사용하지 않겠다.
			//"system.ini" 파일을 사용하지 않겠다.
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
