package day05;

public class BreakExample1 {
	public static void main(String[] args) {
		int i = 0;
		while(true) {
			if(i == 15) break;
			System.out.println(i);
			i += 1;
		}
	}
}
