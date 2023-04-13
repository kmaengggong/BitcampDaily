package poly.casting;

public class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("자식측 2번에서 호출");
	}
	public void method3() {
		System.out.println("자식측 3번에서 호출");
	}
}
