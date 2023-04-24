package collection.list;

import java.util.List;

public class LottoWinSimulatorMain {
	public static void main(String[] args) {
		LottoWinSimulatorGoodCase ls = new LottoWinSimulatorGoodCase();
		List<Integer> lottoNumbers = ls.getLottoNumber();
		List<Integer> myNumbers = ls.getLottoNumber();
		
		ls.tryWinLoop(lottoNumbers, myNumbers);
	}
}
