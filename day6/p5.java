package day6;

import java.util.Scanner; 
public class p5 {
	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in); 
		System.out.print("temperature in Celsius: "); 
		double celsius = sc.nextDouble();
		double fh = celsius * 9.0/5 + 32;
		int fht = (int)fh;
		System.out.printf(" Fahrenheit in double : %.2fF\n", fh);
		System.out.println("Fahrenheit in int: " + fht + "F"); 
		}
}