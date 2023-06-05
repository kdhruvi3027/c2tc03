//7.2
public class Employee extends Member 
{
    private String specialization;

    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization)
    {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}
