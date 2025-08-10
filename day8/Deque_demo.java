package collectionddemo;

import java.util.*;

public class Deque_demo {
public static void main(String[] args) {
	Deque<String> set = new ArrayDeque<String>();
	set.add("Apple");
	set.add("Mango");
	set.add("Kiwi");
	set.add("Banana");
	System.out.println(set);
	System.out.println(set.peek());
	System.out.println(set.element());
	set.poll();
	set.pop();
	System.out.println(set);
}
}
