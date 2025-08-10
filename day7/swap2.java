package day7;

public class swap2 {
public static void main(String[] args) {
	int a = 5, b = 10; System.out.println("\nBefore swap: a = " + a + ", b = " + b);
	swap(a, b); 
	System.out.println("After swap: a = " + a + ", b = " + b); 
	int x = 100; 
	System.out.println("\nBefore method: x = " + x); 
	modifyPrimitive(x); 
	System.out.println("After method: x = " + x);
	} 
public static void tryToChange(int value) {
	value = 20; 
	System.out.println("Inside method: " + value);
	} 
public static void swap(int first, int second) {
	int temp = first;
	first = second; 
	second = temp; 
	System.out.println("Inside swap: first = " + first + ", second = " + second); 
	} 
public static void modifyPrimitive(int num) {
	num *= 2; 
	System.out.println("Inside method - modified: " + num); 
	} 

}
