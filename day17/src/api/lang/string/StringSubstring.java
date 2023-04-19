package api.lang.string;

public class StringSubstring {
	public static void main(String[] args) {
		String ssn = "123456-1789012";
		System.out.println(ssn);
		
		String last = ssn.substring(7);
		System.out.println(last);
		
		String first = ssn.substring(0, 6);
		System.out.println(first);
	}
}
