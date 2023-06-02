//7) Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Employee' class. 
//The 'Employee' and 'Manager' classes have data members'specialization' and 'department' respectively. 
//Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these.

public class Main
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Tom", 25, "555-555-55", "USA", 25631.5, "IT");
        Manager manager = new Manager("Ronit", 30, "555-617-55", "India", 69586.5, "IT");
        employee.printSalary();
        manager.printSalary();
    }
}

