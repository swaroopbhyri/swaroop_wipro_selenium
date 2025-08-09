package Ass_2;
import java.util.Scanner;
public class search {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = Sc.nextInt();

    int[] a = new int[n];
    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
        a[i] = Sc.nextInt();
    }

    System.out.print("Enter the number to search: ");
    int key = Sc.nextInt();

    boolean found = false;

    for (int i = 0; i < n; i++) {
        if (a[i] == key) {
            System.out.println("Number found at position: " + (i + 1));
            found = true;
        }
    }

    if (!found) {
        System.out.println("Number not found in the array.");
    }
}
}
