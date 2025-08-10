package collectionddemo;

import java.util.LinkedHashSet;

public class linkedHashSet_anta {
public static void main(String[] args) {
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	set.add("Apple");
	set.add("Mango");
	set.add("Kiwi");
	set.add("Banana");
	set.add(null);
	System.out.println(set);
	System.out.println(set.getFirst());
	System.out.println(set.getLast());
}
}
