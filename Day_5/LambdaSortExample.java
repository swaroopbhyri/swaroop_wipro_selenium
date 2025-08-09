package Day_5;

import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "kiwi", "strawberry");

        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Sorted by length: " + words);

        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted alphabetically: " + words);
    }
}
