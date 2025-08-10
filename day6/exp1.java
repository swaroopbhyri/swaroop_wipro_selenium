package day6;

public class exp1 { 
	public static void main(String[] args) { 
		try { 
			int n = 10;
			int d = 0;
			int result = n / d; 
			System.out.println("Division result: " + result); 
			} 
		catch (ArithmeticException e) {
			System.out.println("Division by zero error");
			}
		finally { 
			System.out.println("Operation completed."); 
			} 
		try {
			int[] numbers = {1, 2, 3}; 
			System.out.println("Array element: " + numbers[5]); 
			}
		catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("Array index is out of bounds");
} 
		finally { 
			System.out.println("Operation completed.");
			}
		}
	}
