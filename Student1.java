//4.1
import java.util.Scanner;

class Student1 {
    private String name;
    private int id;
    private int age;
    private String mobileNo;

    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter ID: ");
        id = scanner.nextInt();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter mobile number: ");
        mobileNo = scanner.nextLine();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
    }
}



