package collectionddemo;
//unordered
//No duplicates allowed it will override value for that key
//store null(onlu one)
//elements stored on the bases of key 

import java.util.HashMap;
import java.util.Map;

public class Hashmap_anta {
public static void main(String[] args) {
	Map<String, String> map=new HashMap<String, String>();
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
