package collectionddemo;

import java.util.*;

public class Student implements Comparable<Student> {
	int id;
	String name;
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return id - s.id;
	}
	public String toString() {
		return id+ " "+name;
		
		
	}
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(9, "Amit"));
		list.add(new Student(0, "Bharat"));
		list.add(new Student(2, "Chetak"));
		Collections.sort(list);
		
		for(Student s:list) {
			System.out.println(s);
		}
	}
}
