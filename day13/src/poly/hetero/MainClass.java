package poly.hetero;

public class MainClass {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Object[] objs = {a, b, 1, "가나다"};
		for(int i=0; i<objs.length; i++) System.out.println(objs[i]);
	}
}
