package Ass_4;

abstract class SmartDevice {
 abstract void turnOn();
 abstract void turnOff();
 abstract void performFunction();
}


class SmartPhone extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("SmartPhone turned ON");
 }

 @Override
 void turnOff() {
     System.out.println("SmartPhone turned OFF");
 }

 @Override
 void performFunction() {
     System.out.println("Performing calling and browsing...");
 }
}


class SmartWatch extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("SmartWatch turned ON");
 }

 @Override
 void turnOff() {
     System.out.println("SmartWatch turned OFF");
 }

 @Override
 void performFunction() {
     System.out.println("Tracking fitness and showing time...");
 }
}

class SmartSpeaker extends SmartDevice {
 @Override
 void turnOn() {
     System.out.println("SmartSpeaker turned ON");
 }

 @Override
 void turnOff() {
     System.out.println("SmartSpeaker turned OFF");
 }

 @Override
 void performFunction() {
     System.out.println("Playing music and responding to voice commands...");
 }
}

//Main class to test
public class TestDevices {
 public static void main(String[] args) {
   
     SmartDevice[] devices = {
         new SmartPhone(),
         new SmartWatch(),
         new SmartSpeaker()
     };

     for (SmartDevice device : devices) {
         device.turnOn();
         device.performFunction();
         device.turnOff();
         System.out.println("--------------------");
     }
 }
}
