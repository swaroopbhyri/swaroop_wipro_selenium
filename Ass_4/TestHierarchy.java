package Ass_4;

class After_12Th {
 void careerPath() {
     System.out.println("Choose a career path after 12th grade.");
 }
}

class Engineering extends After_12Th {
 void engineeringInfo() {
     System.out.println("You chose Engineering.");
 }
}

class IT extends Engineering {
 void branch() {
     System.out.println("Engineering Branch: IT");
 }
}

class Mechanical extends Engineering {
 void branch() {
     System.out.println("Engineering Branch: Mechanical");
 }
}

class CS extends Engineering {
 void branch() {
     System.out.println("Engineering Branch: Computer Science");
 }
}

class Medical extends After_12Th {
 void medicalInfo() {
     System.out.println("You chose Medical.");
 }
}

class MBBS extends Medical {
 void branch() {
     System.out.println("Medical Branch: MBBS");
 }
}

class BDS extends Medical {
 void branch() {
     System.out.println("Medical Branch: BDS");
 }
}

class Other_courses extends After_12Th {
 void otherCoursesInfo() {
     System.out.println("You chose Other Courses.");
 }
}

class BCA extends Other_courses {
 void branch() {
     System.out.println("Other Course: BCA");
 }
}

class BBA extends Other_courses {
 void branch() {
     System.out.println("Other Course: BBA");
 }
}

public class TestHierarchy {
 public static void main(String[] args) {
     IT it = new IT();
     it.careerPath();
     it.engineeringInfo();
     it.branch();

     System.out.println();

     MBBS mbbs = new MBBS();
     mbbs.careerPath();
     mbbs.medicalInfo();
     mbbs.branch();

     System.out.println();

     BCA bca = new BCA();
     bca.careerPath();
     bca.otherCoursesInfo();
     bca.branch();
 }
}
