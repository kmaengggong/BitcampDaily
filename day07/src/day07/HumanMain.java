package day07;

public class HumanMain {
	public static void main(String[] args) {
		Human a = new Human();
		//a.setName("a");

		System.out.println(a.getName());
		System.out.println(a.getAge());
		
		Human b = new Human("b", 15, 150);
		System.out.println(b);
	}
}
