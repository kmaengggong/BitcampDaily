package day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LunchDinnerChoice {
	public static String lunchDinnerChoicer(String choose){
		// ChatGPT가 엄선한 요리들입니다^^
		String lunch[] = {
			"비빔밥", "김치찌개", "불고기", "떡볶이", "삼겹살",
			"된장지개", "갈비탕", "잡채", "해물파전", "냉면"
		};
		String dinner[] = {
			"갈비찜", "전복죽", "갈비살", "돼지갈비찜", "해물찜",
			"보쌈", "제육볶음", "장어구이", "돌솥비빔밥", "해물탕"
		};
		
		if(choose == "점심")
			return lunch[((int)Math.random()*lunch.length)];
		else
			return dinner[((int)Math.random()*lunch.length)];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 점심 저녁 중 원하는 것 입력 받음
		int choice;
		String choices[] = {"점심", "저녁"};
		System.out.println("점심 or 저녁 메뉴를 추천해주는 프로그램입니다.");
		System.out.println("메뉴는 각각 ChatGPT가 엄선한 10가지 메뉴들로 구성되어 있습니다.");
		System.out.print("점심 저녁 중 원하는 식사를 선택하세요.(1. 점심 / 2. 저녁): ");
		choice = Integer.parseInt(br.readLine());
		
		while(!((choice == 1) || (choice == 2))) {
			System.out.println();
			System.out.println("잘못 입력하였습니다.");
			System.out.print("점심 저녁 중 원하는 식사를 선택하세요.(1. 점심 / 2. 저녁): ");
			choice = Integer.parseInt(br.readLine());
		}
		
		
		System.out.println(
				"금일 " +
				choices[choice-1] + 
				" 추천 메뉴는 \"" +
				lunchDinnerChoicer(choices[choice-1]) + 
				"\"입니다."
		);
		
		br.close();
	}
}