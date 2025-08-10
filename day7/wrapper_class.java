package day7;

public class wrapper_class { 
	public static void main(String[] args) {
		char c = '7'; 
		boolean isDigit = Character.isDigit(c);
		System.out.println("Is '" + c + "' a digit? " + isDigit); 
		// two Strings 
		String str1 = "Hello"; 
		String str2 = "World"; 
		int comparison = str1.compareTo(str2);


System.out.println("Comparison result: " + comparison); 
// valueOf 
Integer intWrapper = Integer.valueOf("123"); 
System.out.println("String to Integer: " + intWrapper); 
// Boolean Wrapper
Boolean boolWrapper = Boolean.valueOf("true"); 
System.out.println("Boolean wrapper: " + boolWrapper);
// null to wrapper 
Integer nullWrapper = null; 
System.out.println("Null wrapper: " + nullWrapper); 
// Pass by value
System.out.println("\n=== Pass by Value Examples ===");
int num = 10; 
System.out.println("Before method call: " + num); 
	}
}
