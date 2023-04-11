package example.encap.good;

public class MyBirthday {
	private int year;
	private int month;
	private int day;
	
	// Constructors
	public MyBirthday(int year, int month, int day) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
	}
	
	// Getters, Setters
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 0) this.year = -year;
		else this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) this.month = month%12;
		else this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day < 1 || day > 31) this.day = day%28;
		else this.day = day;
	}

	// Methods
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(this.year + "년");
		System.out.println(this.month + "월");
		System.out.println(this.day + "일");
	}
}
