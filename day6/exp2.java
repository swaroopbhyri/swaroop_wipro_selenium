package day6;

class OddNumException extends Exception { 
	public OddNumException(String message) { 
		super(message);
		}
	} 
public class exp2 {
	public static void checkOdd(int n) throws OddNumException { 
		if (n % 2 != 0) { 
			throw new OddNumException("Odd number: " + n);
			} 
		System.out.println(n + " is even (no exception thrown)");
		} public static void main(String[] args) {
			int[] testNumbers = {2, 3, 4, 5, 6, 7};
			for (int num : testNumbers) {
				try { checkOdd(num); }
				catch (OddNumException e) {
					System.out.println("Caught exception: " + e.getMessage());
					}
				}
			}
		}