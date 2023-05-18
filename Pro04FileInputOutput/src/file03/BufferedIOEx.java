package file03;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Temp\\test2.txt");
			//fin은 파일을 읽어오는 객체변수로 "test2.txt"를 가리킨다.
			BufferedOutputStream out= new BufferedOutputStream(System.out, 5);
			//모니터로 출력하는데 버퍼의 크기가 5바이트로 설정
			//5를 설정하지 않으면 기본적으로 8192바이트로 설정된다.
			while((c = fin.read()) != -1) {
				out.write(c);	//버퍼의 출력하는 5바이트가 되면 자동으로 화면에 출력
			}
			new Scanner(System.in).nextLine();	//이름이 없는 임의의 객체가 생성
			//데이터가 입력되기를 기다림.
			out.flush();	//버퍼에 남아 있는 데이터를 강제적으로 화면에 출력한다.
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
