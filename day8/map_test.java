package collectionddemo;

import java.util.HashMap;
import java.util.Map;

public class map_test {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(1,"Hii");
	map.put(2, "Bye");
	map.put(3, "tata");
	map.put(4, "see u");
	map.put(5, "Malli kanapadaku");
	System.out.println(map);
	map.put(1, "Haaaiiiiiiiii");//overrides
	System.out.println(map);
	map.replace(4,"c u");
	System.out.println(map);
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());
}
}
