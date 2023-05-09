package coll02;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator = "->";
			}else {
				separator = "\n";
			}
			System.out.print(e + separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("김현지");
		myList.add("김민지");
		myList.add("박혜윤");
		myList.add("유성연");
		myList.add(0, "전재아");		//index 0번째 데이터 삽입
		myList.add(2, "김명연");		//index 2번째 데이터 삽입
		
		printList(myList);
		
		Collections.sort(myList);		//ascending sort
		printList(myList);
		
		Collections.reverse(myList);	//reverse sort
		printList(myList);
		
		//TODO : 연결리스트 알고리즘 공부한 후 다시 시도하기
		int index = Collections.binarySearch(myList, "김현지") + 1;	
		System.out.println("김현지는 " + index + "번째 요소입니다.");
		
	}
}
