package model;

public class Registration {
	private String courseName;
	private int numCredits;
	private int mark;
	private String letterGrade;
	private int weightedGrade;
	private int numGrade;
	
	public Registration(String courseName, int numCredits, int mark) {
		this.courseName = courseName;
		this.numCredits = numCredits;
		this.mark = mark;
	}

	public Object getCourseName() {
		return this.courseName;
	}

	public double getNumberOfCredits() {
		return this.numCredits;
	}

	public Object getMarks() {
		return this.mark;
	}
	
	public Registration(String courseName, int numCredits) {
		this.courseName = courseName;
		this.numCredits = numCredits;
	}

	public void setMarks(int mark) {
		this.mark = mark;
	}
	
	public Object getLetterGrade() {
		if (this.mark >= 50 && this.mark < 60) {
			this.letterGrade = "D";
			this.numGrade = 5;
		} else if (this.mark >= 60 && this.mark < 70) {
			this.letterGrade = "C";
			this.numGrade = 6;
		} else if (this.mark >= 70 && this.mark < 80) {
			this.letterGrade = "B";
			this.numGrade = 7;
		} else if (this.mark >= 80 && this.mark < 90) {
			this.letterGrade = "A";
			this.numGrade = 8;
		} else if (this.mark >= 90 && this.mark <= 100) {
			this.letterGrade = "A+";
			this.numGrade = 9;
		} else {
			this.letterGrade = "F";
			this.numGrade = 0;
		}
		return this.letterGrade;
	}

	public Object getWeightedGradePoint() {
		if (this.mark >= 50 && this.mark < 60) {
			this.numGrade = 5;
		} else if (this.mark >= 60 && this.mark < 70) {
			this.numGrade = 6;
		} else if (this.mark >= 70 && this.mark < 80) {
			this.numGrade = 7;
		} else if (this.mark >= 80 && this.mark < 90) {
			this.numGrade = 8;
		} else if (this.mark >= 90 && this.mark <= 100) {
			this.numGrade = 9;
		} else {
			this.numGrade = 0;
		}
		return this.numGrade * this.numCredits;
	}
}
