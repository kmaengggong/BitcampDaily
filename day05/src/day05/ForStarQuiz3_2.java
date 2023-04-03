package day05;

//     *
//    **
//   ***
//  ****
// *****
// .....
// if문을 통해 구현

public class ForStarQuiz3_2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i < 5-j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
