package Ass_2;
import java.util.Scanner;
public class count_even {
public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	int n=Sc.nextInt();
	int[] a= new int[n];
	int even=0;
	int odd=0;
	for (int i=0;i<a.length;i++) {
		a[i]=Sc.nextInt();
		if (a[i]%2==0) {
			even+=1;
		}
		else {
			odd+=1;
		}
	}
	System.out.println("Total Even Numbers are "+even);
	System.out.println("Total odd Numbers are "+odd);
}
}
