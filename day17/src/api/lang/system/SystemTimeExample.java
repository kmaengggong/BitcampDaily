package api.lang.system;

public class SystemTimeExample {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0;
		
		for(long i=1; i<10000000000l; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}	
}
