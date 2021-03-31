package eecs1022.lab7.bank.model;

public class Bank {
    private String status = "Accounts: {}";
    private double amount;
    private String fromAccount;
    private String toAccount;
    private String name;
    private double balance;
    private final int MAX_NUM_OF_CLIENT = 6;
    private String[][] clients = new String[MAX_NUM_OF_CLIENT][2];
    private int noc = 0;
    private int counter = 0;


    public String getStatus() {
       if (fromAccount != null && name == null && (counter == 0 || counter == 2)) {
           status = "Error: From-Account "+fromAccount+" does not exist";
           this.fromAccount = null;
       }  else if (toAccount != null && name == null && counter == 0) {
           status = "Error: To-Account "+toAccount+" does not exist";
           this.toAccount = null;
       } else if (counter == 2) {
           status = "Error: Maximum Number of Accounts Reached";
       } else if (counter == 1 && name == null && toAccount != null) {
            status = "Error: Non-Positive Amount";
            counter = 0;
        } else if (counter == 1) {
           status = "Error: To-Account " + toAccount + " does not exist";
           counter = 0;
           this.toAccount = null;
       } else if (counter == -1) {
           status = "Error: Client " + name + " already exists";
           counter = 0;
       }else if (name != null && balance <= 0) {
           status = "Error: Non-Positive Initial Balance";
       } else if (name != null && balance > 0) {
           status = "Accounts: {";
           for (int i = 0; i < this.noc;i++) {
               status += this.clients[i][1];
               if (i < this.noc - 1) {
                   status += ", ";
               }
           } status += "}";
       }  this.status = status;
       return status;
    }
    public String[] getStatement(String name) {
        this.fromAccount = name;
        String[] statement = null;
        String[] temp = new String[1];
        for (int i = 0; i < this.clients.length; i++) {
            for (int j = 0; j < this.noc; j++) {
                if (name == this.clients[j][0]) {
                    temp[0] = this.clients[j][1];
                    statement = temp;
                    break;
                }
            }
            if (name != this.clients[i][0]) {
                this.name = null;
                break;
            }
        }
        return statement;
    }

    public void deposit(String name, double amount) {
        this.toAccount = name;
        this.amount = amount;
        if (amount <= 0) {
            this.counter = 1;
        }
    }

    public void withdraw(String name, double amount) {
        this.fromAccount = name;
        this.amount = amount;
    }
    public void transfer(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public void transfer(String fromAccount, String toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.amount = amount;
    }

    public void addClient(String name, double balance) {
        this.name = name;
        this.balance = balance;
        int a = 0;
        for (int i = 0; i < this.clients.length;i++) {
            if (name == this.clients[i][0]) {
                this.counter = -1;
                a = i;
                break;
            }
        } if (noc >= 6) {
            this.counter = 2;
        } else if (balance > 0 && this.clients[a][0] != name) {
            String result = name + ": $" + String.format("%.2f", this.balance);
            this.clients[this.noc][0] = name;
            this.clients[this.noc][1] = result;
            this.noc++;
        }

    }
}
