package Ass_2;
import java.util.Scanner;
public class swap_using_third {
public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	int a=Sc.nextInt();
	int b=Sc.nextInt();
	int c;
	c=a;
	a=b;
	b=c;
	System.out.println(a+" "+b);
}
}
