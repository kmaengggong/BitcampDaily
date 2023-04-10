package example.override;

public class Student extends Human {
	//private String name;
	//private int age;
	private String major;
	
	// Constructors
	public Student(String name, int age, String major) {
		super.setName(name);
		super.setAge(age);
		this.major = major;
	}
	
	// GetSet
	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// Methods
	@Override
	public void introduce() {
		System.out.println("이름: " + super.getName());
		System.out.println("나이: " + super.getAge());
		System.out.println("전공: " + this.major);
	}
	
	
}
