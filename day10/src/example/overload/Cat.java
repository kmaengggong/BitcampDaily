package example.overload;

public class Cat {
	String name = null;
	int age = 0;
	String kind = null;
	
	// Constructors
	public Cat() {
		
	}
	public Cat(String name) {
		this.name = name;
		System.out.println("지금부터 이 아이의 이름은 " + this.name + "입니다.");
	}
	
	// Methods
	public void call() {
		System.out.println("야옹아 이리와");
	}
	public void call(String name) {
		System.out.println(this.name + "아 이리와");
	}
}