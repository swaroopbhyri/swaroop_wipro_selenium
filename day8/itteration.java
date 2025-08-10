package collectionddemo;

import java.util.ArrayList;
import java.util.Iterator;

public class itteration {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("hii");
		al.add("bye");
		al.add("tata");
		System.out.println("______For_____");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			
		}
		
		System.out.println("_______FOR-EACH_____");
		
		for(String temp: al) {
			System.out.println(temp);
		}
		
		System.out.println("______itteration_____");
		
		Iterator<String> irl=al.iterator() ;
		while(irl.hasNext()) {
			System.out.println(irl.next());
		}
		
	}

}
