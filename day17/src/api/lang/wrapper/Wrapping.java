package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {
	public static void main(String[] args) {
		int a = 100;
		double b = 2.41;
		char c = 'H';
		boolean d = false;
		
		Integer val1 = a;
		Double val2 = new Double(b);
		Character val3 = c;
		Boolean val4 = d;
		Byte val5 = (byte)75;
		
		Object[] arr = {val1, val2, val3, val4, val5};
		System.out.println(Arrays.toString(arr));
	}
}
