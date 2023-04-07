package day09;

public class GarbageCollectorTestMain {
	public static void main(String[] args) throws Throwable {
		for(int i=0; i<5; i++) {
			GarbageCollectorTest gct = new GarbageCollectorTest(i);
			gct = null;
			
			System.gc();
		}
	}
}