package Ass_2;
import java.util.Scanner;
public class Sec_highest {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = Sc.nextInt();

    if (n < 2) {
        System.out.println("Array must have at least two elements.");
        return;
    }

    int[] a = new int[n];
    System.out.println("Enter " + n + " numbers:");
    for (int i = 0; i < n; i++) {
        a[i] = Sc.nextInt();
    }

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        if (a[i] > first) {
            second = first;
            first = a[i];
        } else if (a[i] > second && a[i] != first) {
            second = a[i];
        }
    }

    if (second == Integer.MIN_VALUE) {
        System.out.println("No second highest element found (all elements may be equal).");
    } else {
        System.out.println("Second highest element: " + second);
    }
}
}
