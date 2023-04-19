package api.lang.string;

public class StringReplace {
	public static void main(String[] args) {
		String a = """
				가나다라
				바마사아
				자차카타
				파하하하
				""";
		System.out.println(a);
		String newA = a.replace("가나다라", "ABCD");
		System.out.println(newA);
	}
}
