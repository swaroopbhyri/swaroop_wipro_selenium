package Ass_4;
class Student {
    private String name;
    private int rollNumber;
    private int marks;
    
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
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
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

  
    public void inputMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100 && newMarks > this.marks) {
            this.marks = newMarks; // only allow increasing valid marks
        } else {
            System.out.println("Invalid or lower marks. Update rejected.");
        }
    }
}

public class clg {
	 public static void main(String[] args) {
	        Student s1 = new Student("Aman", 101, 95);
	        s1.displayDetails();

	        // Trying to reduce marks (will be rejected)
	        s1.inputMarks(80);

	        // Valid update (increase)
	        s1.inputMarks(98);

	        System.out.println("After attempting update:");
	        s1.displayDetails();
	    }
}
