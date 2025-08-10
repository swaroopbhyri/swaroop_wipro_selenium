package collectionddemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class convertion {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("hii");
		al.add("bye");
		al.add(1);
		al.add(false);
		al.add(1, " al");
		LinkedList ll= new LinkedList(al);
		
		System.out.println(ll);
		
		ArrayList Al = new ArrayList();
		Al.add("hii");
		Al.add("bye");
		Al.add(1);
		Al.add(false);
		Al.add(1, " al");
		LinkedList Ll= new LinkedList();
		Ll.addAll(Al);
		System.out.println(Ll);
		
	}

}
