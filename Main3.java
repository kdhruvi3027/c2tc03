//10) Create a class called Product with the following attributes and methods:
//Attributes:
//name (String)
//price (double)
//quantity (int)
//totalSold (static int)
//Methods:
//void sell(int quantity): This method should decrease the quantity of the product by the given quantity and update the totalSold static variable accordingly.
//static int getTotalSold(): This method should return the total quantity of products sold so far.
//In the Main class, test the Product class by doing the following:
//Create multiple instances of Product and set their name, price, and quantity.
//Call the sell() method for some of the product instances to simulate selling them.
//Print the total quantity of products sold using the getTotalSold() method.
//Write the code to solve the problem


public class Main3 
{
	    public static void main(String[] args)
	    {
	        // Create instances of Product and set their attributes
	        Product product1 = new Product("Product 1", 10.0, 20);
	        Product product2 = new Product("Product 2", 15.0, 30);
	        Product product3 = new Product("Product 3", 12.5, 25);

	        // Simulate selling some products
	        product1.sell(15);
	        product2.sell(10);
	        product3.sell(8);

	        // Print the total quantity of products sold
	        System.out.println("Total products sold: " + Product.getTotalSold());
	    }
}
	
