package model;

public class Item {
	private String item;
	private int amount;
	private int count;
	
	public Item(String item) {
		this.item = item;
		this.count = 1;
	}
	public String getTitle() {
		return this.item;
	}
	public int getAmount() {
		return this.amount;
	}
	public String getInfo() {
		String result = "";
		if(this.count <= 0) {
			if (this.count == 0) {
				this.amount += this.count;
				result = "Error: non-positive amount " + this.count;
			} else {
				this.amount += (-1 * this.count);
				result = "Error: non-positive amount " + this.count;
			}
		} else if (this.amount < 0) {
			result = "Error: amount is short of " + this.count;
			this.amount += this.count;
		} else {
			result = "Item: " + this.item + " (" + this.amount + ")";
		}
		return result;
	}
	public void increaseAmount(int i) {
		this.amount += i;
		if (i <= 0) {
			this.count = i;
		} else {
			this.count = i;
		}
	}
	public void decreaseAmount(int i) {
		if (i <= 0) {
			this.amount += i;
			this.count = i;
		} else {
			this.amount -= i;
			this.count = i;
		}
	}
}
