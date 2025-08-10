package day7;
class IntWrapper {
	int value; 
	} 
public class callby {
	static void change(IntWrapper w) {
		w.value = 10; 
		} 
	public static void main(String[] args) { 
		IntWrapper w = new IntWrapper();
w.value = 5; 
change(w);
System.out.println(w.value);
} 
	}
