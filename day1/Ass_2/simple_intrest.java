package Ass_2;
import java.util.Scanner;
public class simple_intrest {
public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	int p=Sc.nextInt(); //initial principle balance
	int r=Sc.nextInt(); // annual intrest rate
	int t=Sc.nextInt(); //time
	int SI= p*(1+(r*t));
	System.out.println(SI);
}
}
