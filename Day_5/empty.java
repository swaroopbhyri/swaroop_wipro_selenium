package Day_5;
import java.util.function.Predicate;

public class empty {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();

        System.out.println(isEmpty.test(""));      
        System.out.println(isEmpty.test("Hello")); 
    }
}
