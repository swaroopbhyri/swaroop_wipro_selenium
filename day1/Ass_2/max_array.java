package Ass_2;
import java.util.Scanner;
public class max_array {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int n=Sc.nextInt();
	int[] a= new int[n];
	int max=0;
	for (int i=0;i<n;i++) {
		a[i]=Sc.nextInt();
	}
	int min = a[0];
	for (int i=0;i<n;i++) {
		if (max<a[i]) {
			max=a[i];
		}
	}
	for (int i=0;i<n;i++) {
		if (min>a[i]) {
			min=a[i];
		}
	}
	System.out.println("max is "+max);
	System.out.println("min is "+min);
}
}
