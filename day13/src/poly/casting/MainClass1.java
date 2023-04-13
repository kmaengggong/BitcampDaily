package poly.casting;

public class MainClass1 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method1();
		p.method2();
		//p.method3();
		System.out.println("-------------------");
		Child c = (Child) p;
		c.method1();
		c.method2();
		c.method3();
	}
}
