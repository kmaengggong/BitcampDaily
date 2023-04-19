package api.lang.string;

public class StringTrim {
	public static void main(String[] args) {
		String trimBefore = "	asdf	qwer	1234	";
		System.err.println(trimBefore);
		String trimAfter = trimBefore.trim();
		System.out.println(trimAfter);
	}
}
