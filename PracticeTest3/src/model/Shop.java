package model;

public class Shop {
	private Customer[] customers;
	private int noc;
	
	public Shop() {
		this.customers = new Customer[100];
		this.noc = 0;
	}
	public Customer[] getCustomers() {
		Customer[] result = new Customer[this.noc];
		for (int i = 0; i < this.noc; i ++) {
			result[i] = this.customers[i];
		}
		return result;
	}
	public void addCustomer(Customer c) {
		this.customers[this.noc] = c;
		this.noc ++;
	}
	public void pay(String name) {
		for (int i = 0; i < this.noc; i ++) {
			Customer c = this.customers[i];
			if (c.getName().equals(name)) {
				c.withdraw(c.getAmountDue());
				c.clear();
			}
		}
	}
}
