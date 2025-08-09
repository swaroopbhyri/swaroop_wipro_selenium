package Ass_2;
import java.util.Scanner;
public class palindrome_String {
public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	String S=Sc.nextLine();
	String a="";
	S=S.toLowerCase().replace(" ", "");
	for (int i=S.length()-1;i>=0;i--) {
		a+=S.charAt(i);
	}
	if(S.equals(a)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
}
}
