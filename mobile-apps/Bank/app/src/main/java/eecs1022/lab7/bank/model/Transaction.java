package eecs1022.lab7.bank.model;

public class Transaction {
    private String status;
    private double amount;
    private String serviceType;

    public Transaction(String serviceType, double amount) {
        this.serviceType = serviceType;
        this.amount = amount;
    }
    public String getStatus() {
        if (serviceType != null && amount > 0) {
            status = "Transaction " + serviceType + ": $" + String.format("%.2f", amount);
        }
        return status;
    }
}
