package day05;

public class NestedForQuiz {
	public static void main(String[] args) {
		// 중첩반복문을 이용해서
		// 4x + 5y = 60
		// 이 방정식의 양수 해를 모두 구하는 반복문을 작성해주세요
		int coeffX = 4;
		int coeffY = 5;
		int answer = 60;
		// 4x + 5y = 60에서 x의 양수 해는 60/4 = 15개를 넘을 수 없다.
		// y도 마찬가지. 60/5 = 12개를 넘을 수 없다.
		// 그 중 작은 수인 12개를 넘을 수 없음.
		int xy[][] = new int[answer/coeffY][2];
		
		for(int i=0; i<answer/coeffX; i++) {
			for(int j=0; j<answer/coeffY; j++) {
				if((coeffX*i) + (coeffY*j) == answer) {
					xy[j][0] = i;
					xy[j][1] = j;
				}
			}
		}
		for(int i=0; i<xy.length; i++) {
			if((xy[i][0] != 0) && (xy[i][1] != 0)) {
				System.out.println(xy[i][0] + " " + xy[i][1]);
			}
		}
	}
}
