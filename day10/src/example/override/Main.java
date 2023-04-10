package example.override;

public class Main {
	public static void main(String[] args) {
		Human h1 = new Human("사람", 20);
		Student s1 = new Student("학생", 17, "이과");

		h1.introduce();
		s1.introduce();
		
		Programmer p1 = new Programmer("김코딩", 30, "주니어", 2);
		
		p1.코딩하기();
	}
}
