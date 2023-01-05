package entities;

public class Client {
    private int accountNumber;
    private String name;
    private double balance;
    private String response;
    private final double tax = 5.00;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    public int getAccountNumber() { return accountNumber; }
    public void setAccountNumber(int  accountNumber) {
        this.accountNumber = accountNumber;}

    public double getBalance() { return balance; }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public String toString() {
        return "Account: "
               +String.format("%d", accountNumber)
               + ", Holder: "
               + String.format("%s", name)
               + ", Balance: $"
               + String.format("%.2f", balance);

    }

    public String getResponse() { return response; }
    public void setResponse(String response) {
        this.response = response;
    }

    public void withdraw(double value){
        balance -= value;
        balance -= tax;
    }

}
