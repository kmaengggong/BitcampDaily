package poly.static_.var;

public class Asean {
	// Instance Field
	private String studentName;
	private int attendanceScore;
	private int finalExamScore;
	
	// Static Filed
	private static int presentationScore = 30;
	
	// Constructors
	public Asean(String studentName, int attendanceScore, int finalExamScore) {
		this.studentName = studentName;
		this.attendanceScore = attendanceScore;
		this.finalExamScore = finalExamScore;
	}
	
	// Methods
	public static int getPresentationScore(){
		return presentationScore;
	}
	
	// Show Methods
	public void showStudentScore() {
		System.out.println("학생 이름: " + this.studentName);
		System.out.println("출석 점수: " + this.attendanceScore);
		System.out.println("기말 점수: " + this.finalExamScore);
		System.out.println("발표 점수: " + presentationScore);
	}
}
