package has_a;

public class Gun {
	// Field
	private int bullet;
	private String modelName;
	private String gunNumber;
	
	// Constructors
	public Gun(String modelName, String gunNumber) {
		this.bullet = 5;
		this.modelName = modelName;
		this.gunNumber = gunNumber;
	}
	
	// Methods
	public void shoot() {
		if(this.bullet > 0) {
			this.bullet -= 1;
			System.out.println("Shot the gun");
		}
		else {
			System.out.println("Out of bullet");
		}
	}
	public void reload() {
		this.bullet = 5;
	}
}
