package day7;

class Student {
	String name;
	int marks; 
	Student(String name, int marks) { 
		this.name = name; 
		this.marks = marks; 
		} 
	void updateMarks(int newMarks) { 
		this.marks = newMarks; 
		} 
	} 
public class student { 
	public static void main(String[] args) {
		Student s = new Student("Swaroop", 99);
		System.out.println("Before: " + s.marks); 
		s.updateMarks(90); 
		System.out.println("After: " + s.marks);
}
	}