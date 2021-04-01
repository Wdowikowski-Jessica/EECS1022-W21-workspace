package model;

public class Transcript {
	private String name;
	private static int i = 3;
	private String id;
	private Registration[] registrations; 
	private int nor;
	private String courseName;
	
	public Transcript(String name) {
		this.name = name;
		this.id = this.name + Transcript.i;
		Transcript.i += 3;
		this.nor = 0;
		this.registrations = new Registration[60];
	}
	
	public Object getStudentID() {
		return this.id;
	}

	public Registration[] getReport() {
		Registration[] result = new Registration[this.nor];
		for(int i = 0; i < this.nor; i ++) {
			result[i] = this.registrations[i];
		}
		return result;
	}

	public void addRegistration(Registration r1) {
		this.registrations[this.nor] = r1;
		this.nor ++;
	}

	public void addRegistration(String courseName, int numCredits) {
		this.addRegistration(new Registration(courseName,numCredits));
	}

	public void addRegistrations(Registration[] registrations2) {
		for (int i = 0; i <registrations2.length; i ++) {
			this.addRegistration(registrations2[i]);
		}
	}

	public void addRegistration(String courseName, int numCredits, int mark) {
		this.addRegistration(new Registration(courseName,numCredits,mark));
	}
	
	public Object getMarks(String courseName) {
		return courseName;
	}

	public void setMarks(String courseName, int mark) {
		
	}

	public double getWeightedGPA() {
		// TODO Auto-generated method stub
		return 0;
	}

}
