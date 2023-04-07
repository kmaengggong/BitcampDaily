package day09;

public class GarbageCollectorTest {
	public int objectNum;
	
	// Constructors
	public GarbageCollectorTest(int objectNum) {
		this.objectNum = objectNum;
		System.out.println(this.objectNum + "번 객체가 생성되었습니다.");
	}
	
	// Destructors
	@Override
	protected void finalize() throws Throwable{
		System.out.println(this.objectNum + "번 객체가 힙에서 삭제됩니다.");
	}
	
}