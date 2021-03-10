package model;

public class Instructor {
	private int ext;
	private String contact;
	private String name;
	private String info;
	
	public Instructor(String name, int ext, String contact) {
		this.ext = ext;
		this.contact = contact;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPhoneExtension() {
		return this.ext;
	}
	
	public String getEmail() {
		return this.contact;
	}
	
	public String getInformation() {
		info = "Instructor " + this.name + " has campus phone extension " + this.ext + " and contact email " + this.contact;
		return info;
	}
	
	public void setPhoneExtension (int ext) {
		this.ext = ext;
	}
	
	public void setEmail (String contact) {
		this.contact = contact;
	}
	
	public void setName (String name) {
		this.name = name;
	}
}
