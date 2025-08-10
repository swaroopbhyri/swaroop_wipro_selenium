package collectionddemo;

import java.util.Stack;

public class Stack_demo {
public static void main(String[] args) {
	Stack<Integer> s= new Stack<Integer>();
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	s.push(6);
	System.out.println(s);
	s.pop();
	System.out.println(s);
	System.out.println(s.capacity());
	
}
}
