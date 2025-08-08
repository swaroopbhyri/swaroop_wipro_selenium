package Ass_1;
import java.util.Scanner;
public class fact_num {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		int n= Sc.nextInt();
		int prd=1;
		for (int i=1;i<=n;i++) {
			prd*=i;
		}
		System.out.println(prd);
	}

}
