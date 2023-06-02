//8)  Inheritance using this keyword
public class stu1 {
	public static void main(String s[])
	{
		stu2 s1=new stu2(98789,24);
		System.out.println("Enter details:");
		System.out.println("Enter Mobile no = "+s1.getmobile());
		System.out.println("Enter Age ="+s1.getage());
		s1.display();
		s1.eat();
	}
}
