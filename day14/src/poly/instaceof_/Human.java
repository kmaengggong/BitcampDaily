package poly.instaceof_;

public class Human {
	// Field
	private String name;
	private int age;
	
	// Constructors
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Human() {
		this("noname", 0);
	}
	
	// Methods
	
	// Show Methods
	public void showinfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
	}
}
