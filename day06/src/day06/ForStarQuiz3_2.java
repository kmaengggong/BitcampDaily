package day06;

public class ForStarQuiz3_2 {
	public static void main(String[] args) {
		// 중첩 반복문 + if문으로 별찍기
		//     *
		//    **
		//   ***
		//  ****
		// *****
		int n = 5;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j < n-i-1) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
	}
}