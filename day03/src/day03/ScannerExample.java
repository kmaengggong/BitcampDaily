package day03;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요!");
		String userName = sc.next();
		
		System.out.println("안녕하세요! " + userName + " 님!");
		
		sc.close();
	}
}
