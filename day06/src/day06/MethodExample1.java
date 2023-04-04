package day06;

// 1. 메서드 정의(선언)이 이루어져야 추후 호출 가능
// 2. 메서드의 선언은 메서드 내부에서 불가
//    클래스 내부이면서 다른 메서드 외부에 작성해야 함
// 3. 메서드 내부에서는 다른 메서드의 호출만 가능
// 4. 호출하는 과정은 다른 메서드 내부 지역으로 이동해서 해당 코드를 실행하고
//    타 메서드 호출이 끝나면 원래 호출했던 그 위치로 복귀함.

public class MethodExample1 {
	public static void sayHello() {
		System.out.println("Hello, World!");
	}
	
	public static int calcSum(int x) {
		int sum = 0;
		for(int i=0; i<x; i++) sum += (i+1);
		return sum;
	}
	
	public static int totalSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		sayHello();
		System.out.println(calcSum(10));
		System.out.println(totalSum(5, 10));
	}
}