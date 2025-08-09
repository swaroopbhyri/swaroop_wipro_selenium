package Ass_4;


class Vehicles {
 Vehicles() {
     System.out.println("Vehicle Created");
 }

 void run() {
     System.out.println("Vehicle is running");
 }
}


class Bike extends Vehicles {
 Bike() {
     super(); 
     System.out.println("Bike Created");
 }

 @Override
 void run() {
     System.out.println("Bike is running smoothly");
 }
}


public class TestVehicle {
 public static void main(String[] args) {
     Vehicles v = new Bike(); 
     v.run(); 
 }
}

