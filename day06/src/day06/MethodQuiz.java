package day06;

public class MethodQuiz {
	public static void printHelloWorld(int n) {
		for(int i=0; i<n; i++) System.out.println("Hello World!");
	}
	public static void printNotHelloWorld() {
		System.out.println("Not Hello World!");
		System.out.println("Not Hello World!");
		System.out.println("Not Hello World!");
	}
	public static void printHelloUser(String name, int n) {
		for(int i=0; i<n; i++) System.out.println("Hello " + name);
	}
	public static void main(String[] args) {
		printHelloWorld(7);
		System.out.println("----------");
		printNotHelloWorld();
		System.out.println("----------");
		printHelloUser("Java", 3);
	}
}
