import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNumber;
        String name;
        double amount;
        BankAccount account =null;

        while(true){
            System.out.println("1. Create 2. Deposit 3.Withdraw 4. Balance 5.Exit");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    accountNumber=sc.nextInt();
                    name=sc.next();
                    account = new SavingsAccount(accountNumber, name);        
                    break;
                case 2:
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    break;
                case 3:
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Your balance is:"+account.getBalance());
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
