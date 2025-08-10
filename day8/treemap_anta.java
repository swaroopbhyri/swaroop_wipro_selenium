package collectionddemo;
//same as hashmap but follows insretion order in alphabetical order and doesnot store null
//unordered
//No duplicates allowed it will override value for that key
//elements stored on the bases of key
import java.util.Map;
import java.util.TreeMap;


public class treemap_anta {
	public static void main(String[] args) {
		TreeMap<String, String> map=new TreeMap<String, String>();
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
		System.out.println(map.ceilingKey("Five"));
}
}
