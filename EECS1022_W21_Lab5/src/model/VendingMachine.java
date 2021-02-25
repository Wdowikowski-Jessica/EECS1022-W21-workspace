package model;

public class VendingMachine {
	// making the items told to us in the pdf file.
	private int coke;
	private int orangeJuice;
	private int kitKatChunkyBar;
	private int laysClassicChips;
	private int value;
	private String item;
	
	public VendingMachine() {
		
	}
	// checking the stock of each item
	public String checkStock(String item) {
		String result = "";
		if (item == "Coke") {
			result += "Coke (" + this.coke + ")";
		} else if (item == "Orange Juice") {
			result += "Orange Juice (" + this.orangeJuice + ")";
		} else if (item == "Kitkat Chunky Bar") {
			result += "Kitkat Chunky Bar (" + this.kitKatChunkyBar + ")";
		} else if (item == "Lay's Classic Chips") {
			result += "Lay's Classic Chips (" + this.laysClassicChips + ")";
		} else {
			result += "Invalid product: " + item;
		}
		return result;
	}
	
	public String checkStock() {
		String result = "Stock: Coke (" + this.coke + "), Orange Juice (" + this.orangeJuice + "), " + "Kitkat Chunky Bar (" + this.kitKatChunkyBar + "), Lay's Classic Chips (" + this.laysClassicChips + ")";
		return result;
	}
	
	public String checkStatus() {
		String result = "";
		if (this.value > 0) {
			if (item == "Coke") {
				result = "Product added: Coke (" + this.value + ")";
			} else if (item == "Orange Juice") {
				result = "Product added: Orange Juice (" + this.value + ")";
			} else if (item == "Kitkat Chunky Bar") {
				result = "Product added: Kitkat Chunky Bar (" + this.value + ")";
			} else if (item == "Lay's Classic Chips") {
				result = "Product added: Lay's Classic Chips (" + this.value + ")";
			} else {
				result = "Invalid product: " + item;
			}
			} else if (this.value < 0) {
			if (item == "Coke") {
				result = "Product removed: Coke (" + (this.value * (-1))+ ")";
			} else if (item == "Orange Juice") {
				result = "Product removed: Orange Juice (" + (this.value * (-1)) + ")";
			} else if (item == "Kitkat Chunky Bar") {
				result = "Product removed: Kitkat Chunky Bar (" + (this.value * (-1)) + ")";
			} else if (item == "Lay's Classic Chips") {
				result = "Product removed: Lay's Classic Chips (" + (this.value * (-1)) + ")";
			} else {
				result = "Invalid product: " + item;
			}
			}
			else if (this.value == 0) {
				result = "Empty VM Started";
			}
		return result;
		}
	
	public void add (String item, int value) {
		this.value = value;
		this.item = item;
		if (item == "Coke") {
			this.coke += value;
		} else if (item == "Orange Juice") {
			this.orangeJuice += value; 
		} else if (item == "Kitkat Chunky Bar") {
			this.kitKatChunkyBar += value; 
		} else if (item == "Lay's Classic Chips") {
			this.laysClassicChips += value; 
		} 
	}
	
	public void dispense (String item, int value) {
		this.value = value * (-1);
		this.item = item;
		if (item == "Coke") {
			this.coke -= value;
		} else if (item == "Orange Juice") {
			this.orangeJuice -= value; 
		} else if (item == "Kitkat Chunky Bar") {
			this.kitKatChunkyBar -= value; 
		} else if (item == "Lay's Classic Chips") {
			this.laysClassicChips -= value; 
		} 
	}
}
