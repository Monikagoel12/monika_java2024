package package2;

public class Students {
	
	int RollNo;
	int Age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you!!");
	}
	
	public void dispaly2()
	{
		System.out.println("Automation is very easy");
	}
	
public static void main(String[] args)
{
	Students ob = new Students();
	ob.RollNo=15;
	ob.Age=6;
	System.out.println("Roll No. is "+ob.RollNo);
	System.out.println("Age is "+ob.Age);
	ob.display1();
	ob.dispaly2();
}
			
	

}


