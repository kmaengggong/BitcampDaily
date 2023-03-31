package day04;

public class ForQuiz {
	public static void main(String[] args) {
		// 랜덤 구구단(1~9)
		int googoo = (int)(Math.random()*9+1);  // 0~1 -> 0~9 -> 1~10. 1 ~ 9.
		for(int i=1; i<10; i++) System.out.println(i*googoo);
	}
}
