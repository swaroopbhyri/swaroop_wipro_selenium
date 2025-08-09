package Ass_2;
import java.util.Scanner;
public class count_vowels {
public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	String S=Sc.nextLine();
	int count=0;
	S.toLowerCase();
	for (int i=0;i<S.length();i++) {
		if (S.charAt(i) =='a' || S.charAt(i)=='e' || S.charAt(i)=='i' || S.charAt(i)=='o' || S.charAt(i)=='u') {
			count+=1;
		}
	}
	System.out.println("NO of vowels are ="+count);
}
}
