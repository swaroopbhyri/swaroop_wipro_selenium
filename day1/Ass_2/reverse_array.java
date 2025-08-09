package Ass_2;
import java.util.Scanner;
public class reverse_array {
public static void main(String[] args) {
	  Scanner Sc = new Scanner(System.in);

      System.out.print("Enter the number of elements: ");
      int n = Sc.nextInt();

      int[] a = new int[n];
      System.out.println("Enter " + n + " elements:");
      for (int i = 0; i < n; i++) {
          a[i] = Sc.nextInt();
      }

      System.out.println("Array in reverse order:");
      for (int i = n - 1; i >= 0; i--) {
          System.out.print(a[i] + " ");
      }
}
}
