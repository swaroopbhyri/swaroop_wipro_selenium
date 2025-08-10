package collectionddemo;

import java.util.LinkedHashMap;
import java.util.Map;
//same as hashmap but follows insretion order
//unordered
//No duplicates allowed it will override value for that key
//store null(only one)
//elements stored on the bases of key 
public class linked_hashmap {
	public static void main(String[] args) {
		Map<String, String> map=new LinkedHashMap<String, String>();
		map.put(null, "nothing");
		map.put("One", "Hii");
		map.put("Two", "Bye");
		map.put("Three", "tata");
		map.put("Four", "see u");
		map.put("Five", "Malli kanapadaku");
		System.out.println(map);
		map.put("one", "Haaaiiiiiiiii");//overrides
		System.out.println(map);
		map.replace("Four","c u");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
}
}
