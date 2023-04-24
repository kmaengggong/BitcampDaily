package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorBadCase2 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 파워볼 넘버
		List<Integer> powerNumbers = new ArrayList<>();
		
		while(powerNumbers.size() < 5) {
			Integer thisTimeGetNumber = ran.nextInt(1, 71);
			if(!powerNumbers.contains(thisTimeGetNumber)) {
				powerNumbers.add(thisTimeGetNumber);
			}
		}
		Collections.sort(powerNumbers);
		
		Integer powerNumber = ran.nextInt(1, 27);
		powerNumbers.add(powerNumber);
		
		// 선택 넘버
		List<Integer> myNumbers = new ArrayList<>();
		long count = 0;
		
		while(!powerNumbers.equals(myNumbers)) {
			myNumbers.clear();
			
			while(myNumbers.size() < 5) {
				Integer thisTimeGetNumber = ran.nextInt(1, 71);
				if(!myNumbers.contains(thisTimeGetNumber)) {
					myNumbers.add(thisTimeGetNumber);
				}
			}
			Collections.sort(myNumbers);
			
			Integer myNumber = ran.nextInt(1, 27);
			myNumbers.add(myNumber);
			
			count += 1;
		}
		
		System.out.println("당첨번호: " + powerNumbers);
		System.out.println(count + "번째만에 파워볼에 당첨되었습니다^^");
	}
}
