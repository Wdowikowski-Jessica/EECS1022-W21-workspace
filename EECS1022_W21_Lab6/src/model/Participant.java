package model;

public class Participant {
	private Registration[] suyeonRegistrations;
	private int marks;
	private String name;
	private String report;
	private String t;
	
	public Participant (String name) {
		this.name = name;
	}
	
	public Registration[] getRegistrations() {
		return suyeonRegistrations;
	}
	
	public String getGPAReport() {
		if (t==null) {
			report = "No GPA avaiable yet for S. Y. Lee";
		}
		return report;
	}
	
	public int marksOf(String t) {
		return -1;
	}
	
	public void addRegistration(Registration i) {
	}
	
	public void addRegistration(String t) {
		this.t = t;
	}
	
	public void updateMarks(String t, int marks) {
		this.t = t;
		this.marks = marks;
	}
	
	public void clearRegistrations() {
		suyeonRegistrations = new Registration[0];
	}
}
