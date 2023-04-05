package day07;

public class HomeworkExample2 {
	public static void main(String[] args) {
		String menu[] = {
				"대창덮밥", "돈카츠", "도식면", "선지해장국",
				"수제비", "보쌈정식", "초밥"
		};
		
		int idx = (int)(Math.random() * menu.length);
		
		System.out.println(menu[idx]);
	}
}