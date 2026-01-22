abstract class BankAccount{
    // encapsulation
    private String accountNumber;
    private String name;
    protected double balance;
    BankAccount(String accountNumber,String name){
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=0.0;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
        }else {
            System.out.println("Invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public abstract void withdraw(double amount);
}
