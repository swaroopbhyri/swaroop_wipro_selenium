package Ass_4;

class Calculator {

   
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(3, 7, 2));
        System.out.println("Sum of 2 doubles: " + calc.add(4.5, 3.2));
    }
}
