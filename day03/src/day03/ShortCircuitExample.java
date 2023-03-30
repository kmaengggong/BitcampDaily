package day03;

public class ShortCircuitExample {
	public static void main(String[] args) {
		//System.out.println(false & (3 / 0 == 1));
		System.out.println(false && (3 / 0 == 1));
		
		//System.out.println(true | (3 / 0 == 1));  // 에러
		System.out.println(true || (3 / 0 == 1));  // 뒷 항을 확인 안해서 에러 X
	}
}
