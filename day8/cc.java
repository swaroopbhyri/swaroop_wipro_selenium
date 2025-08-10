package collectionddemo;

import java.util.*;

public class cc {
public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<String>();
	
	li.add("Hii");
	li.add("Bye");
	li.add("See u");
	li.add("Tata");
	ArrayList<String> al=new ArrayList<String>(li);
	System.out.println("Linked list: "+li);
	System.out.println("Array List: "+al);
	
}
}
