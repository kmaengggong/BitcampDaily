package collection.map;

import java.util.HashMap;
import java.util.Scanner;

public class MapQuiz {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> accounts = new HashMap<>();
		
		System.out.println("*** 회원가입을 시작합니다 ***");
		System.out.print("아이디를 입력하세요: ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요: ");
		String password = sc.nextLine();
		accounts.put(id, password);
		
		// 로직
		while(true) {
			System.out.println("*** 로그인을 해주세요 ***");
			System.out.print("아이디: ");
			id = sc.nextLine();
			System.out.print("비밀번호: ");
			password = sc.nextLine();
			if(!accounts.containsKey(id)) {
				 System.out.println("아이디가 존재하지 않습니다");
				 continue;
			}
			else {
				if(!accounts.containsValue(password)) {
					System.out.println("비밀번호가 틀렸습니다");
					continue;
				}
				else {
					System.out.println("*** 로그인 성공 ***");
					break;
				}
			}
		}

		sc.close();
	}
}
