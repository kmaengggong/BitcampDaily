package strequals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserMain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1 == s2);
		
		User u = new User("abcd123");
		System.out.print("비밀번호를 입력해주세요: ");
		String password = br.readLine();
		
		if(password == u.pw) {
			System.out.println("비밀번호가 일치합니다.");
		}
		else {
			System.out.println("비밀번호가 일치하지 않습니다");
		}
		
		br.close();
	}
}
