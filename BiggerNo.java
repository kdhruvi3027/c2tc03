//Write a program that will take 2 values from users and use ternary operators to find the largest number among them.
import java.util.Scanner;
class BiggerNo
{
	public static void main(String s[])
	{
		int n1,n2,LargeNo;
		Scanner i1 =new Scanner(System.in);
		System.out.println("Enter number 1:");
		n1=i1.nextInt();
		System.out.println("Enter number 2:");
		n2=i1.nextInt();
			
		LargeNo=(n1>n2) ? n1 : n2;
		System.out.println("Largest Number:"+LargeNo);
	
	}
}
