package Ass_1;
import java.util.Scanner;
public class count_digits {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = Math.abs(num); // To handle negative numbers

        if (temp == 0) {
            count = 1; // Special case: 0 has 1 digit
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Total digits: " + count);
    }
}
