package api.util;

import java.util.Arrays;

public class ArraysSearch {
	public static void main(String[] args) {
		int[] scores = {75, 47, 23, 56, 89};
		int[] scores2 = Arrays.copyOf(scores, 3);
		
		Arrays.sort(scores2);
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2));
		
		int index = Arrays.binarySearch(scores, 75);
		System.out.println("75가 저장된 인덱스 번호: " + index);
		
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {1, 3, 5, 7, 9};
		String result = Arrays.equals(arr1, arr2) ? "일치" : "불일치";
		System.out.println(result);
		
	}
}
