package eecs1022.lab7.bank.model;

public class Client {
    private String status;
    private double amount;
    private String name;
    private int not = 1;
    private final int MAX_NUM_OF_TRANSACTION = 11;
    private double balance;
    private String[] statement = new String[MAX_NUM_OF_TRANSACTION];
    private String trans;
    private int num = 1;


    public Client(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getStatus() {
        status = this.name + ": $" + String.format("%.2f", balance);
        this.status = status;
        return status;
    }

    public String[] getStatement() {
        String[] temp = new String[this.not];
        this.getStatus();
        this.statement[0] = this.status;
        if (this.not > 1 && this.not < 11) {
            this.statement[this.num] = this.trans;
            this.num++;
        }
        for (int i = 0; i < this.not; i++) {
            temp[i] = this.statement[i];
        }
        this.not++;
        return temp;
    }

    public void deposit(double deposit) {
        balance += deposit;
        this.trans = "Transaction DEPOSIT: $" + String.format("%.2f", deposit);
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;
        this.trans = "Transaction WITHDRAW: $" + String.format("%.2f", withdraw);
    }
}
