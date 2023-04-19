package api.lang.stringb;

public class StringTest {
	public static void main(String[] args) {
		long start, end;
		
		start = System.currentTimeMillis();
		String str = "ABCD";
		for(int i=0; i<100; i++) {
			str += "ABCD";
		}
		end = System.currentTimeMillis();
		System.out.println("String: " + (end-start));
		
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("ABCD");
		for(int i=0; i<100000000; i++) {
			sb.append("ABCD");
		}
		end = System.currentTimeMillis();
		System.out.println("String: " + (end-start));
		
		start = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("ABCD");
		for(int i=0; i<100000000; i++) {
			sb.append("ABCD");
		}
		end = System.currentTimeMillis();
		System.out.println("String: " + (end-start));
	}
}
