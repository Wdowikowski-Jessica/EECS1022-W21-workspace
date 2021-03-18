package model;

public class Repository {
	private Item[] items;
	private int noi;
	
	public Repository(int i) {
		this.items = new Item[4];
		this.noi = 0;
	}
	public Item[] getItems() {
		Item[] result = new Item[this.noi];
		for (int i = 0; i < this.noi; i ++) {
			result[i] = this.items[i];
		}
		return result;
	}
	public Item[] getItems(String[] titles) {
		Item[] result = new Item[this.noi];
		for (int i = 0; i < this.noi; i ++) {
			result[i] = this.items[i];
		}
		return result;
	}
	public Item[] getItemsOutsideRange(int a, int b) {
		Item[] result = new Item[this.noi];
		for (int i = 0; i < this.noi; i ++) {
			result[i] = this.items[i];
		}
		return result;
	}
	public int getAmount(String s) {
		return -1;
	}
	public void addItem(Item i) {
		this.items[this.noi] = i;
		this.noi ++;
	}
	public void addItem(Item[] item) {
		for (int i = 0; i <item.length; i ++) {
			this.addItem(item[i]);
		}
	}
	public void decreaseAmount(String s, int i) {
		
	}
}
