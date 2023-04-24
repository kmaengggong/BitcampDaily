package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoWinSimulatorBadCase {
	public static void main(String[] args) {
		// 1. 당첨 번호 6개를 먼저 뽑고
		// 2. 추첨번호 6개를 추가로 뽑아서 같은게 나올때까지 비교 -> 추첨 을 반복
		
		// 입력
		List<Integer> lottoNumbers = new ArrayList<>();
		//for(int i=1; i<=6; i++) lottoNumbers.add(i);  // 1, 2, 3, 4, 5, 6
		while(lottoNumbers.size() < 6) {
			int lottoNumber = (int)(Math.random()*45)+1;
			if(!lottoNumbers.contains(lottoNumber)) lottoNumbers.add(lottoNumber);
		}
		Collections.sort(lottoNumbers);
		System.out.println(lottoNumbers);
		
		List<Integer> myNumbers = new ArrayList<>();
		
		// 로직
		long count = 0;
		do {
			myNumbers.clear();
			while(myNumbers.size() < 6) {
				int myNumber = (int)(Math.random()*45)+1;
				if(!myNumbers.contains(myNumber)) myNumbers.add(myNumber);
			}
			Collections.sort(myNumbers);
			//System.out.println(myNumbers);
			count += 1;
		} while(!lottoNumbers.equals(myNumbers));

		// 출력
		System.out.println(myNumbers);
		System.out.println(count + "번 만에 로또에 당첨되엇읍니다^^");
	}
}
