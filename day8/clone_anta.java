package collectionddemo;

import java.util.LinkedList;
import java.util.List;

public class clone_anta {
public static void main(String[] args) {
	LinkedList<Integer> li=new LinkedList<Integer>();
	for (int i=1;i<5;i++) {
	li.add(i);
	}
	Object l1=new LinkedList<String>();
	l1=li.clone();
	System.out.println("og = "+li);
	System.out.println("clone="+l1);
	
}
}
