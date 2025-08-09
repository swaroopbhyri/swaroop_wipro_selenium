package Day_5;


interface SumFunction {
 int sum(int a, int b);
}

public class sum {
 public static void main(String[] args) {

     // Lambda expression for sum
     SumFunction add = (a, b) -> a + b;

     // Test the lambda
     int num1 = 10;
     int num2 = 20;
     int result = add.sum(num1, num2);

     System.out.println("Sum of " + num1 + " and " + num2 + " = " + result);
 }
}
