package inheritance;

public class InheritanceExampleMain {
	public static void main(String[] args) {
		//Human a = new Student();
		//Student a = new Human();
		
		Student st1 = new Student();
		st1.name = "김학생";
		st1.age = 20;
		st1.major = "기계공학";
		
		SalaryMan sm1 = new SalaryMan();
		sm1.name = "나직장";
		sm1.age = 40;
		sm1.salary = 8000000;
	}
}
