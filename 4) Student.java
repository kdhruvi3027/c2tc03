//class Student1.java
//4)  Write a program in java contains two class Student(main class) and Student1.
//Student1 contains the members like name, id, age, mobileno and member function getdata() 
//to get the data and display() to display the data , create a object of class Student1 and 
//use the member function getdata() and display() to enter the data and display the data respectively.

public class Student {
    public static void main(String[] args) 
    {
        Student1 student1 = new Student1();

        System.out.println("Enter student details:");
        student1.getData();

        System.out.println("\nStudent details:");
        student1.display();
    }
}
