package exception.runtime;

public class NullPointerExample {
	public static void main(String[] args) {
		String str = null;
		str = "Hello";
		
		System.out.println(str.toLowerCase());
	}
}
