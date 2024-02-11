package package2;

public class Assignment2_4feb
{
public void m()
{
	System.out.println("Default method");
}
public void m1(int a)
{
	System.out.println("One parametrized method");
}
public void m2(int a, int b)
{
	System.out.println("Two parametrized method");
}
public void m3(int a, int b,int c)
{
	System.out.println("Three parametrized method");
}
public void m4(int a, int b , int c, int d)
{
	this.m3(1, 2, 3);
	System.out.println("Four parametrized method");
	this.m();
	this.m1(1);
	this.m2(1, 2);
}

public static void main(String[] args) 
{
	Assignment2_4feb ob = new Assignment2_4feb();
	ob.m4(1,2,3,5);
}
}
