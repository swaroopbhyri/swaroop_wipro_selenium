package day7;

public class referance {
	static void changeRef(Student s) { 
		s = new Student("Ramesh", 95);
} 
	public static void main(String[] args) {
		Student s = new Student("swaroop", 80); 
		changeRef(s);
		System.out.println(s.name); 
		}
	}
