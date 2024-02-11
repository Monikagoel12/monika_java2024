package package2;
//(10+2)(10-2)
public class Assignment1 
{
public int sum(int a, int b)
{
	int c;
	c= a+b;
	System.out.println("Result of sum is "+c);
	return c;
	
}
public int sub(int x, int y)
{
	int z;
	z= x-y;
	System.out.println("Result of sub is "+z);
	return z;
	
}
public void multi(int r, int s)
{
	int result;
	result= r*s;
	System.out.println("Final result value is "+result);
}
public static void main(String[] args) 
{
	Assignment1 ob=new Assignment1();
	int sumresult =ob.sum(10,2);
	int subresult = ob.sub(10,2);
	ob.multi(sumresult,subresult);
	
}
}
