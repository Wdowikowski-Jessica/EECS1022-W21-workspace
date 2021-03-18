package model;

public class Record {
	private String item;
	private double price;
	private int quantity;
	
	public Record(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Record() {
		
	}
	public String getItem() {
		return this.item;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	public void setItem(String s) {
		this.item = s;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public void setQuantity(int i) {
		this.quantity = i;
	}
	
}
