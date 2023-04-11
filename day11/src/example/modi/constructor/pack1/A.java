package example.modi.constructor.pack1;

public class A {
	// Constructors
	public A(boolean b) {}
	A(int i) {}
	private A(String s) {}
	
	A a1 = new A(true);
	A a2 = new A(3);
	A a3 = new A("hi");
}
