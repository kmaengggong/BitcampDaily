package poly.instaceof_;

public class MainClass {
	public static void main(String[] args) {
		Human h1 = new Human("김자바", 20);
		Student s1 = new Student("학생임", 19);
		Cat c1 = new Cat("모린", 7);
		
		h1.showinfo();
		s1.showinfo();
		c1.meow();
		
		System.out.println(h1 instanceof Human);
		System.out.println(s1 instanceof Student);
		System.out.println(c1 instanceof Cat);
	}
}
