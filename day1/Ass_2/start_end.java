package Ass_2;
import java.util.Scanner;
public class start_end {
public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	String S=Sc.nextLine();
	S=S.toLowerCase();
	if(S.startsWith("j") && S.endsWith("a")) {
		System.out.println(S);
	}
}
}
