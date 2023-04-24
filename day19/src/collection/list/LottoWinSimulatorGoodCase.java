package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorGoodCase {
	// Field
	private long count = 0;
	private static Random rand = new Random();
	
	// Getters, Setters
	public long getCount() {
		return this.count;
	}
	public void addCount() {
		this.count += 1;
	}
	
	// Methods
	public List<Integer> getLottoNumber() {
		List<Integer> lottoNumbers = new ArrayList<>();
		
		while(lottoNumbers.size() < 6) {
			int lottoNumber = rand.nextInt(1, 46);  // more efficient than Math.random()
			//int lottoNumber = (int)(Math.random()*45)+1;
			if(!lottoNumbers.contains(lottoNumber)) lottoNumbers.add(lottoNumber);
		}
		Collections.sort(lottoNumbers);
		
		return lottoNumbers;
	}
	public void tryWinLoop(List<Integer> lottoNumbers, List<Integer> myNumbers) {
		while(!lottoNumbers.equals(myNumbers)) {
			myNumbers = getLottoNumber();
			addCount();
		}
		
		showWin();
	}
	
	// ShowMethods
	public void showWin() {
		System.out.printf("%d 번만에 로또에 당첨되었습니다^^", getCount());
	}
}
