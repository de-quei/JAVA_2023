//C:\\Temp\\test.txt파일을 이용해서 testout.txt파일 생성하는
//프로그램을 작성하시오
//FileReader클래스와 FileWriter클래스를 사용해서 작성하시오
package file02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) {
        File src = new File("C:\\Temp\\test.txt");
        File dest = new File("C:\\Temp\\testout.txt");
        int c;
        
        try {
        	FileReader fr = new FileReader(src);
        	FileWriter fw = new FileWriter(dest);
        	while((c = fr.read()) != -1) {	//fr은 "test.txt"에 있는 데이터를 한 문자씩 읽음
        		fw.write((char)c);			//fw가 가리키는 "testout.txt"파일에 출력한다.
        	}
        	fr.close();
        	System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        }catch(IOException e) {
        	System.out.println("파일 복사오류!");
        }
    }
}