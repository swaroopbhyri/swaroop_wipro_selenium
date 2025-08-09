package Ass_2;
import java.util.Scanner;
public class space_hyphens {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	String S=Sc.nextLine();
	S=S.replace(' ', '-');
	System.out.println(S);
}
}
