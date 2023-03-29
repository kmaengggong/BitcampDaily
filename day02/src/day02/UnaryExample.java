package day02;

public class UnaryExample {
	public static void main(String[] args) {
		int i = 1;
		int j = i++;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println();
		
		int x = 1;
		int y = ++x;
		// ++x를 먼저 더하고(x는 2)
		// int y = x를 수행합니다.(y는 2)
		// 최종적으로 x는 2, y는 2를 저장받습니다.
		
		System.out.println(x);
		System.out.println(y);
	}
}
