package example.override;

public class Human {
	private String name;
	private int age;

	// Constructors
	public Human() {
		
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// GetSet
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Methods
	public void introduce() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
	}
	public void 코딩하기() {
		System.out.println("일반인이라 코딩을 못합니다");
	}
}
