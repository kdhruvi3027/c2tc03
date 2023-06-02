//5.1
public class account 
{
	private String AccName;
    private double balance; // Account balance

    public String getAccName()
	{
		return AccName;
	}
	
	public void setAccName(String n)
	{
		AccName=n;
	}
	
    public account() 
    {
        balance = 5000; // Initial balance
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double newBalance) 
    {
        balance = newBalance;
    }

    public void checkBalance() 
    {
        System.out.println("Your current balance is: " + balance);
    }

    public void withdrawMoney(double amount) 
    {
        if (balance >= 1000 && balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance to withdraw.");
        }
    }
    public void depositMoney(double amount)
    {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }
}
