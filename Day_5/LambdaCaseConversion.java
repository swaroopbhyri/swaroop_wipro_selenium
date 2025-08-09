package Day_5;

import java.util.function.Function;

public class LambdaCaseConversion {
    public static void main(String[] args) {
        Function<String, String> toUpper = s -> s.toUpperCase();
        Function<String, String> toLower = s -> s.toLowerCase();

        String text = "Hello World";

        System.out.println("Original: " + text);
        System.out.println("Uppercase: " + toUpper.apply(text));
        System.out.println("Lowercase: " + toLower.apply(text));
    }
}
