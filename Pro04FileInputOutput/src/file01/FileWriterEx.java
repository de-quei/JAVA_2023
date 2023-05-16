package file01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//scanner 객체 생성
		FileWriter fout = null;
		//fout 출력파일 객체 변수 선언
		int c;
		
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");
			//fout은 "test.txt"파일을 가리키는 파일 객체변수
			while(true) { //무한반복
				String line = scanner.nextLine();
				if(line.length() == 0)
					break; //입력하지 않고 Enter키를 누르면 while문을 빠져나온다.
				fout.write(line, 0, line.length());
				//line의 0번째 데이터 부터 입력된 데이터의 길이 만큼을
				//fout이 가리키는 "test.txt"파일에 출력한다.
				fout.write("\r\n"); //test.txt파일에 한 줄 띄기 위해 "\r\n"을 저장
				//줄을 바꾸고 커서를 맨 앞으로 이동
			}
			fout.close();
		}catch(IOException e){
			System.out.println("입출력 오류");
		}
	}

}
