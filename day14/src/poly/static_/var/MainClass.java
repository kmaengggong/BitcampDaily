package poly.static_.var;

public class MainClass {
	public static void main(String[] args) {
		System.out.println(Asean.getPresentationScore());
		
		Asean a1 = new Asean("채종훈", 20, 43);
		Asean a2 = new Asean("서은영", 20, 46);
		Asean a3 = new Asean("장재인", 20, 45);
		Asean a4 = new Asean("정일윤", 14, 42);
		
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
	}
}
