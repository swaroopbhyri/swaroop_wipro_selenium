package Ass_4;

class Bank {
 double getInterestRate() {
     return 0.0; // Default
 }
}

class SBI extends Bank {
 @Override
 double getInterestRate() {
     return 6.7;
 }
}

class ICICI extends Bank {
 @Override
 double getInterestRate() {
     return 7.0;
 }
}

class HDFC extends Bank {
 @Override
 double getInterestRate() {
     return 7.5;
 }
}

public class TestBank {
 public static void main(String[] args) {
     Bank b1 = new SBI();
     Bank b2 = new ICICI();
     Bank b3 = new HDFC();

     System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
     System.out.println("ICICI Interest Rate: " + b2.getInterestRate() + "%");
     System.out.println("HDFC Interest Rate: " + b3.getInterestRate() + "%");
 }
}

