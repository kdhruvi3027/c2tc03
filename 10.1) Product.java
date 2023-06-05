//10.1)
public class Product 
{
	private String name;
    private double price;
    private int quantity;
    private static int totalSold = 0;

    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) 
    {
        if (quantity <= this.quantity)
        {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + "(s) sold successfully.");
        } 
        else
        {
            System.out.println("Insufficient quantity of " + name + " to sell.");
        }
    }
    public static int getTotalSold() {
        return totalSold;
    }
}
