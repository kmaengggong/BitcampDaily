package day04;

public class ForExample1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0; i<5; i++) sum += i;
		
		System.out.println("0~4까지의 누적합: " + sum);
	}
}
