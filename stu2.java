//8.2
public class stu2 extends atm_action {

	private long mobileno;
	private int age;
	stu2(long mo,int age)
	{
		this.mobileno=mo;
		this.age=age;
	}
	public long getmobile() {
		return this.mobileno;
	}
	public int getage() {
		return this.age;
	}
	public void display()
	{
		System.out.println("The mobile no is"+this.mobileno);
		System.out.println("The age is"+this.age);
	}
}

