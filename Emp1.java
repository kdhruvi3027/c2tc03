//6)  Write a program using constructor that would print 
//the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. 
//The output should be as follows:
//Name         Year of joining                         Address
//Robert            1994                                    64C- WallsStreet
//Sam                2000                                     68D- WallsStreet
//John                1999                                     26B- WallsStreet

public class Emp1
{
	public static void main(String[] args)
	{
	    Employee1 e1 = new Employee1("Robert", 1994, "64C- WallsStreet");
	    Employee1 e2 = new Employee1("Sam", 2000,  "68d- WallsStreet");
	    Employee1 e3 = new Employee1("John", 1999, "26B- WallsStreet");
	    System.out.println("Name\tYear of joining\t\tAddress");
	    System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t"+e1.getAddress());  // printing details of employee 1
	    System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t"+e2.getAddress());  // printing details of employee 2
	    System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t"+e3.getAddress()); 
	    
	  }
}
