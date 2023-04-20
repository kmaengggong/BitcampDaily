package collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
	public static void main(String[] args) {
		// 입력
		List<Integer> lottoNumbers = new ArrayList<>();
		for(int i=1; i<=6; i++) lottoNumbers.add(i);  // 1, 2, 3, 4, 5, 6
		List<Integer> myNumbers = new ArrayList<>();
		
		// 로직
		int count = 0;
		do {
			myNumbers.clear();
			while(myNumbers.size() < 6) {
				int myNumber = (int)(Math.random()*45)+1;
				if(!myNumbers.contains(myNumber)) myNumbers.add(myNumber);
			}
			Collections.sort(myNumbers);
			System.out.println(myNumbers);
			count += 1;
		} while(!lottoNumbers.equals(myNumbers));

		// 출력
		System.out.println(count + "번 만에 로또에 당첨되엇읍니다^^");
	}
}
