public class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String name){
        super(accountNumber, name);
    }
    @Override
    public void withdraw(double amount){
        if(amount>0 && amount<balance){
            balance=balance-amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }  
};
