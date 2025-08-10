package day8;

import java.util.ArrayList; 
public class removeall { 
	public static void main(String[] args) { 
		ArrayList<String> subjects = new ArrayList<>();
subjects.add("Math");
subjects.add("Science");
subjects.add("History"); 
subjects.add("English"); 
subjects.add("Art");
System.out.println("Original List: " + subjects); 
System.out.println("Original Size: " + subjects.size()); 
int index = subjects.indexOf("Math"); 
if(index != -1) { 
	subjects.set(index, "Statistics"); 
	System.out.println("\nAfter updating Math to Statistics:"); 
	System.out.println("Updated List: " + subjects); 
	System.out.println("Size remains: " + subjects.size()); 
	}
subjects.clear();
System.out.println("\nAfter clear():");
System.out.println("List content: " + subjects); 
System.out.println("Size after clear: " + subjects.size()); 
}
	}