package example.overload;

public class Human {
	String name;
	int age;
	
	// Constructors
	public Human() {
		this.name = null;
		this.age = 0;
	}
	public Human(String name, int age) {
		this.name = name;
		System.out.println("지금부터 이 아이의 이름은 " + this.name + "입니다.");
		this.age = age;
	}
}
