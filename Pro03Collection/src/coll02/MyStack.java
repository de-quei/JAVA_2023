package coll02;

public class MyStack {
	public static void main(String[] args) {
		
		//Stack algorithm
		//LIFO : Last In First Out
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("Seoul");
		stringStack.push("Daegu");
		stringStack.push("Jeju");
		
		for(int n = 0; n < 3; n++) {
			System.out.println(stringStack.pop());
		}
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int n = 0; n < 3; n++) {
			System.out.println(intStack.pop());
		}
		
	}
}
