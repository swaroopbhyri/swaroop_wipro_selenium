package Day_5;

public class Student {
    private String name;
    private int rollNumber;
    private int marks; 

   
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks entered! Setting marks to 0.");
            this.marks = 0;
        }
    }


    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }


    public void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("-------------------------");
    }


    public static void main(String[] args) {
        Student s1 = new Student("Swaroop", 101, 95);
        Student s2 = new Student("Ram", 102, 120); 
        Student s3 = new Student("Shyam", 103, -5); 

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

