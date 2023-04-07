package equals.array;

import java.util.Arrays;

public class ArrayEqualsTest {
	public static void main(String[] args) {
		int[] intArray1 = { 1, 2, 3, 4, 5 };
		System.out.println("배열 주소: " + intArray1);
		System.out.println(Arrays.toString(intArray1));
		System.out.println();
		
		int[] intArray2 = intArray1.clone();
		intArray1[0] = 100;
		System.out.println(Arrays.toString(intArray1));
		System.out.println(Arrays.toString(intArray2));
		System.out.println("배열2 주소: " + intArray2);
	}
}
