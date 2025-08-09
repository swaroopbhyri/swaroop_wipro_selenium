package Ass_4;

class Hospital {
 String hospitalName = "City Care Hospital";
 String location = "Bangalore";

 void hospitalDetails() {
     System.out.println("Hospital Name: " + hospitalName);
     System.out.println("Location: " + location);
 }
}


class Patient extends Hospital {
 String patientName;
 int age;

 Patient(String patientName, int age) {
     this.patientName = patientName;
     this.age = age;
 }

 void patientDetails() {
     
     System.out.println("Patient Name: " + patientName);
     System.out.println("Age: " + age);
     System.out.println("--- Hospital Info ---");
     hospitalDetails(); 
 }
}

public class TestHospital {
 public static void main(String[] args) {
     Patient p1 = new Patient("Swaroop", 28);
     p1.patientDetails();
 }
}
