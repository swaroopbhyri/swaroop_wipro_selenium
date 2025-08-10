package collectionddemo;

import java.util.Vector;

public class vector {
public static void main(String[] args) {
	Vector<String> list = new Vector<String>();
	list.add(0,"Apple");
	list.add(1,"Mango");
	list.add(2,"Kiwi");
	list.add(3,"Banana");
	System.out.println(list);
	System.out.println(list.get(3));
	list.set(2, "Guava");
	System.out.println(list);
	System.out.println(list.contains("Banana"));
	System.out.println(list.equals("Banana")); //Compares whole list
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	System.out.println(list.indexOf("Guava"));
	System.out.println(list.isEmpty());
	list.remove(0);
	System.out.println(list);
	list.remove("Kiwi");
	System.out.println(list.reversed());
}
}
