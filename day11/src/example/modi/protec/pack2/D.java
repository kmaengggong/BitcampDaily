package example.modi.protec.pack2;

import example.modi.protec.pack1.A;

public class D extends A {
	public D() {
		//A a = new A();
		//a.s = "hi";
		//a.method();
		
		super();  // super() 생성자는 무조건 첫 줄에 위치해야 함.
		super.s = "hi";
		super.method();
	}
}
