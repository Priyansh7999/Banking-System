import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountNumber;
        String name;
        double amount;
        BankAccount account =null;

        while(true){
            System.out.println("1. Create 2. Deposit 3.Withdraw 4. Account Info 5.Exit");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("enter account number:");
                    accountNumber=sc.next();
                    System.out.println("enter your name:");
                    name=sc.next();
                    account = new SavingsAccount(accountNumber, name);        
                    break;
                case 2:
                    if(account==null){
                        System.out.println("First create the account");
                        break;
                    }
                    System.out.println("enter amount to deposit:");
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    System.out.println("Amount Deposit : "+amount);
                    System.out.println("New Balance : "+account.getBalance());
                    break;
                case 3:
                    if(account==null){
                        System.out.println("First create the account");
                        break;
                    }
                    System.out.println("enter amount to withdraw:");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    System.out.println("Amount Withdraw : "+amount);
                    System.out.println("New Balance : "+account.getBalance());
                    break;
                case 4:
                    if(account==null){
                        System.out.println("First create the account");
                        break;
                    }
                    System.out.println("Account Number is:"+account.getAccountNumber());
                    System.out.println("Name :"+account.getName());
                    System.out.println("Balance :"+account.getBalance());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Enter correct input");
                    break;
            }
        }
    }
}
