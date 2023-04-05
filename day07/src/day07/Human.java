package day07;

public class Human {
	private String name;
	private int age;
	private int height;
	
	// Constructors
	public Human(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Human() {
		//
	}
	
	// Get, Set
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
}
