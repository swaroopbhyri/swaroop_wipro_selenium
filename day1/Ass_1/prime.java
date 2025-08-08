package Ass_1;
import java.util.Scanner;
public class prime {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int t=0;
	for (int i=2;i<=n/2;i++) {
		if (n%i==0) {
			t++;
		}
	}
	if(t==0) {
		System.out.println("Prime");
	}
	else {
		System.out.println("Not a prime");
	}
}
}
