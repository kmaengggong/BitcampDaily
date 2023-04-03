package day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//     *
//    **
//   ***
//  ****
// *****
// .....

public class ForStarQuiz3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<n+1; i++) {
			// 공백 만드는 부분
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			// 별 만드는 부분
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
