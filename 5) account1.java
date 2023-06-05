//class account.java
//5)  Create a program of ATM  which allows you to withdraw and deposit money. 
//Your min balance must be 1000 while withdrawing and if it is less then you can't withdraw money .
//During deposit it simply add the amount to the balance. by using getter and setter
//MAIN CLASS & ANOTHER CLASS IS account.java 
import java.util.*;

public class account1 
{
    public static void main(String[] args) 
    {
        account a1 = new account();
        Scanner scanner = new Scanner(System.in);
        a1.setAccName("Shruti Patel");
        a1.setBalance(7000);
        System.out.println("Account Name= "+a1.getAccName());
		System.out.println("Balance= "+a1.getBalance());
		
        while (true) 
        {
            System.out.println("ATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    a1.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double amountToWithdraw = scanner.nextDouble();
                    a1.withdrawMoney(amountToWithdraw);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double amountToDeposit = scanner.nextDouble();
                    a1.depositMoney(amountToDeposit);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
