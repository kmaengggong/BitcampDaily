package example.this_.human;

public class Human {
	public String name;
	public int age;
	
	// Constructors
	public Human() {
		this("이름없음", -2);
	}
	public Human(String name) {
		this(name, -1);
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Methods
	public void showInfo() {
		System.out.println("이름: " + this.name + ", 나이: " + this.age);
	}
}
