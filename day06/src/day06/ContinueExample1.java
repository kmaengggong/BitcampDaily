package day06;

public class ContinueExample1 {
	public static void main(String[] args) {
		// 짝수만 출력하는 continue
		for(int i=1; i<11; i++) {
			if(i%2 != 0) continue;
			System.out.println(i);
		}
	}
}
