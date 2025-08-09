package Day_5;

import java.util.function.Predicate;

public class evennn {
	public static void main(String[] args) {
		Predicate<Integer> isEven=num->num%2==0;
		System.out.println(isEven.test(7));
	}
}
