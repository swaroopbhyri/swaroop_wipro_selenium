package day6;

class Animal {
void makeSound() {
	System.out.println("animal sound");
	} 
}
class Dog extends Animal {
	void makeSound() { 
		System.out.println("Woof!");
		} 
	void fetch() { 
		System.out.println("Fetching the ball...");
		}
	}
public class Overridingg { 
	
	public static void main(String[] args) {
		Dog d = new Dog(); 
		Animal a = d; a.makeSound();
		} 
	}