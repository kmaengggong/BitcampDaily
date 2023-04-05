package day07;

public class MethodExample {
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	public static void callMyName(String name) {
		if(name.length() < 2) {
			System.out.println("이름은 최소 2글자 이상 입력해야 합니다.");
			return;
		}
		System.out.println("내 이름은 " + name + "입니다.");
	}
	public static int[] totalOperate(int n1, int n2) {
		int[] total = { n1+n2, n1-n2, n1*n2, n1/n2 };
		return total;
	}
	
	public static void main(String[] args) {
		int result1 = add(3, 5);
		System.out.println(result1);
		
		int result2 = add(add(2, 4), add(5, 6));
		System.out.println(result2);
		
		int[] tot = totalOperate(20, 7);
		System.out.println(tot[0]);
		System.out.println(tot[1]);
		System.out.println(tot[2]);
		System.out.println(tot[3]);
		
		callMyName("김자바");
		callMyName("채");
		
	}
}
