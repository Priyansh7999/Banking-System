abstract class BankAccount{
    // encapsulation
    private int accountNumber;
    private String name;
    private double balance;
    public BankAccount(int accountNumber,String name){
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=0.0;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public abstract void withdraw(double amount);
}