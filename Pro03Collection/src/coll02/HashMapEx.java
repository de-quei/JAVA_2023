package coll02;

import java.util.HashMap;
import java.util.Scanner;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어 : ");
			String eng = scanner.next();
			if(eng.equals("exit")) {	//문자열 비교는 equals 메소드
				System.out.println("종료");
				break;
			}
			
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println(eng + "는 없는 단어입니다.");
			}
			else {
				System.out.println(kor);
			}
		}
		
		
	}

}
