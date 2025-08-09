package Ass_4;

class hospital {
 void hospitalInfo() {
     System.out.println("Welcome to the Hospital");
 }
}

class Doctor extends hospital {
 void doctorInfo() {
     System.out.println("Doctor Department");
 }
}

class Gynac extends Doctor {
 void specialization() {
     System.out.println("Specialization: Gynecology");
 }
}

class Endo extends Doctor {
 void specialization() {
     System.out.println("Specialization: Endocrinology");
 }
}

class Cardiac extends Doctor {
 void specialization() {
     System.out.println("Specialization: Cardiology");
 }
}

class Operation extends Cardiac {
 void service() {
     System.out.println("Cardiac Service: Operation");
 }
}

class OPD extends Cardiac {
 void service() {
     System.out.println("Cardiac Service: OPD");
 }
}


class Nurse extends hospital {
 void nurseInfo() {
     System.out.println("Nursing Department");
 }
}

class Accountant extends hospital {
 void accountantInfo() {
     System.out.println("Accounts Department");
 }
}

class Payments extends Accountant {
 void task() {
     System.out.println("Task: Handle Payments");
 }
}

class Documentation extends Accountant {
 void task() {
     System.out.println("Task: Maintain Documentation");
 }
}

public class hospitallll {
 public static void main(String[] args) {
     Operation op = new Operation();
     op.hospitalInfo();
     op.doctorInfo();
     op.specialization();
     op.service();

     System.out.println();

     Payments pay = new Payments();
     pay.hospitalInfo();
     pay.accountantInfo();
     pay.task();

     System.out.println();

     Nurse nurse = new Nurse();
     nurse.hospitalInfo();
     nurse.nurseInfo();
 }
}
