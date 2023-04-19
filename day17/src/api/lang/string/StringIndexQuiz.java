package api.lang.string;

import java.util.Scanner;

public class StringIndexQuiz {
	public static void main(String[] args) {
		// 1. 특정 문장을 스캐너로 입력 받으세요.
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		// 2. 1에서 입력받은 문장에서 조회할 단어를 적으세요.
		String find = "ab";
		
		// 3. 단어가 몇 개 있는지 카운팅하고, 몇 번 인덱스에 각각 있는지 콘솔에 출력하세요.
		int count = 0;
		int len = line.length();
		int idx = -1;

		for(int i=0; i<len; i++) {
			int now = line.indexOf(find, i);
			if(now != idx && now != -1) {
				idx = now;
				count += 1;
			}
		}
			
		System.out.println(count);
	}
}
