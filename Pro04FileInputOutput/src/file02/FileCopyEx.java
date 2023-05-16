//C:\\Temp\\test.txt파일을 이용해서 testout.txt파일 생성하는
//프로그램을 작성하시오
//FileReader클래스와 FileWriter클래스를 사용해서 작성하시오
package file02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) {
        String sourceFile = "C:\\Temp\\test.txt";
        String destinationFile = "C:\\Temp\\testout.txt";

        try {
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destinationFile);

            char[] buffer = new char[4096]; // 4KB 버퍼 크기로 설정

            int charsRead;
            while ((charsRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charsRead);
            }

            System.out.println("파일이 성공적으로 복사되었습니다.");

            // 리더와 라이터를 닫습니다.
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}