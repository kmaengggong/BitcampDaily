package has_a;

public class Police {
	// Field
	private Gun gun;
	private String name;
	private int height;
	
	// Constructors
	public Police(Gun gun, String name, int height) {
		this.gun = gun;
		this.name = name;
		this.height = height;
	}
	
	// Show Methods
	public void showStatus() {
		System.out.println("이름: " + this.name);
		System.out.println("키: " + this.height);
		System.out.println("총: " + this.gun);
	}
	
	// Methods
	public void shoot() {
		gun.shoot();
	}
	public void reload() {
		gun.reload();
	}
}
