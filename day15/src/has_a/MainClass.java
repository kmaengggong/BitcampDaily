package has_a;

public class MainClass {
	public static void main(String[] args) {
		Gun g1 = new Gun("K2", "587957");
		Police p1 = new Police(g1, "경찰", 180);
		
		p1.showStatus();
		p1.shoot();
		p1.shoot();
		p1.shoot();
		p1.showStatus();
		p1.reload();
		p1.shoot();
	}
}
