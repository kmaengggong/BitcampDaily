package api.lang.stringb;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JAVA");
		
		sb.append(" Program Study");
		System.out.println(sb.toString());
		
		sb.insert(12, "ming");
		System.out.println(sb.toString());
		
		sb.replace(5, 16, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 9);
		System.out.println(sb.toString());
	}
}
