package example.override;

public class Programmer extends Human {
	private String level;
	private int yearsOfExperience;
	
	// Constructors
	public Programmer() {
		
	}
	public Programmer(String name, int age, String level, int yearsOfExperience) {
		super.setName(name);
		super.setAge(age);
		this.level = level;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	// GetSet
	public String getLevel() {
		return this.level;
	}
	public int getYearsOfExperience() {
		return this.yearsOfExperience;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void setYearsOfExperince(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	// Methods
	@Override
	public void 코딩하기() {
		System.out.println(
				this.yearsOfExperience +
				"년차 프로그래머 " +
				super.getName() +
				" 씨는 레벨 " +
				this.level +
				"만큼의 코딩을 할 수 있습니다."
		);
	}
}
