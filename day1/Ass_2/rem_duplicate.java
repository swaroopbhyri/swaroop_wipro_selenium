package Ass_2;
import java.util.Scanner;
public class rem_duplicate {
public static void main(String[] args) {
	 Scanner Sc = new Scanner(System.in);

     System.out.print("Enter number of elements: ");
     int n = Sc.nextInt();
     int[] a = new int[n];

     System.out.println("Enter " + n + " elements:");
     for (int i = 0; i < n; i++) {
         a[i] = Sc.nextInt();
     }

     int[] temp = new int[n];
     int k = 0;

     for (int i = 0; i < n; i++) {
         boolean isDuplicate = false;
         for (int j = 0; j < k; j++) {
             if (a[i] == temp[j]) {
                 isDuplicate = true;
                 break;
             }
         }
         if (!isDuplicate) {
             temp[k] = a[i];
             k++;
         }
     }

     System.out.println("Array after removing duplicates:");
     for (int i = 0; i < k; i++) {
         System.out.print(temp[i] + " ");
     }
}
}
