package package2;
//((((10+2)+2)-2)*2)/2)
public class Assignment_3feb 
{
public int sum(int a,int b)
 {
	int c;
	c= a+b;
	return c;
	
 }
public int sub(int x, int y)
 {
	int z;
	z=x-y;
	return z;
 }
public int multi(int k,int l)
 {
	int m;
	m=k*l;
	return m;
 }
	
public void div(int r, int s)
 {
	int t;
	t= r/s;
	System.out.println("Final result value is "+t);
 }
public static void main(String[] args)

{
	Assignment_3feb ob = new Assignment_3feb();
	int sumresult = ob.sum(10,2);
	int sumresult2 = ob.sum(sumresult,2);
	int subresult = ob.sub(sumresult2,2);
	int multiresult = ob.multi(subresult,2);
	ob.div(multiresult,2);
}
	
	
}
