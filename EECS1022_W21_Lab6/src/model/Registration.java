package model;

public class Registration {
	private String t;
	private int m;
	private Instructor i;
	private String info;
	private String[] gr;
	
	public Registration (String t) {
		this.t = t;
	}
	
	public Registration (String t, Instructor i) {
		this.setInstructor(i);
		this.t = t;
	}
	
	public Instructor getInstructor() {
		this.setInstructor(i);
		return this.i;
	}
	
	public String[] getGradeReport() {
		String marks[] = new String[2];
		if (m >= 0 && m <= 49) {
			marks[0] = "F";
			marks[1] = "Failing";
		} else if (m >= 50 && m <= 59) {
			marks[0] = "D";
			marks[1] = "Passing";
		} else if (m >= 60 && m <= 69) {
			marks[0] = "C";
			marks[1] = "Competent";
		} else if (m >= 70 && m <= 79) {
			marks[0] = "B";
			marks[1] = "Good";
		} else if (m >= 80 && m <= 89) {
			marks[0] = "A";
			marks[1] = "Excellent";
		} else if (m >= 90 && m <= 100) {
			marks[0] = "A+";
			marks[1] = "Exceptional";
		}
		gr = marks;
		return this.gr;
	}
	
	public String getInformation() {
		if (i==null) {
			this.info = t + " has not yet been assigned an instructor";
		} else {
			this.info = t + ", taught by " + this.getInstructor().getName() + ", is completed with raw marks " + m + " (" + this.getGradeReport()[0] + " ; " + this.getGradeReport()[1] + ")";
		}
		return this.info;
	}
	
	public String getTitle() {
		return this.t;
	}
	
	public int getMarks() {
		return this.m;
	}
	
	public void setMarks(int marks) {
		this.m = marks;
	}
	
	public void setInstructor(Instructor i) {
		this.i = i;
	}
}
