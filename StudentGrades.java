//3)  Write a program to take 3 values from user and find addition and average of these values
//and grade them like if avg marks>90 then A , between 80 to 90 then B, between 70 to 80 then C otherwise fail
import java.util.Scanner;
public class StudentGrades
{
	public static void main(String s[])
	{
		int a,b,c,d,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subject 1:");
		a=sc.nextInt();
		System.out.println("Enter marks of subject 2:");
		b=sc.nextInt();
		System.out.println("Enter marks of subject 3:");
		c=sc.nextInt();
		System.out.println("Enter marks of subject 4:");
		d=sc.nextInt();
		
		sum=a+b+c+d;
		System.out.println("Total Marks="+sum);
		
		double avg= sum/4.0;
		System.out.println("Average marks="+avg);
		
		if(avg>90)
		{
			System.out.println("Grade A");
		}
		else if((avg>80) && (avg<90))
		{
			System.out.println("Grade B");
		}
		else if((avg>70) && (avg<80))
		{
			System.out.println("Grade C");
		}
		else{
			System.out.println("Fail");
		}
			
	}
}
