package collectionddemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator_demo {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add(0,"Apple");
	list.add(1,"Mango");
	list.add(2,"Kiwi");
	list.add(3,"Banana");
	Iterator<String> itrs=list.iterator();
	while (itrs.hasNext()){
		System.out.println(itrs.next());
	}
}
}
