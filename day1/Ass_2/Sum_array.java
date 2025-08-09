package Ass_2;
import java.util.Scanner;
public class Sum_array {
public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	int n=Sc.nextInt();
	int[] a= new int[n];
	int sum=0;
	for (int i=0;i<a.length;i++) {
		a[i]=Sc.nextInt();
		sum+=a[i];
	}
	System.out.println(sum);
}
}
