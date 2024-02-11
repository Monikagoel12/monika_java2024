package package2;
//(10/2)+2)-2)+2)/2)
public class Assignment2_3feb
{
public float div(float a, float b)
{
	float c;
	c= a/b;
	return c;
}
public float sum(float x, float y)
{
	float z;
	z= x+y;
	return z;
}
public float sub(float r, float s)
{
	float t;
	t= r-s;
	return t;
}
public static void main(String[] args) 
{
	Assignment2_3feb ob = new Assignment2_3feb();
	float divresult= ob.div(10,2);
	float sumresult= ob.sum(divresult,2);
	float subresult= ob.sub(sumresult,2);
	float sumresult2= ob.sum(subresult,2);
	float divresult2= ob.div(sumresult2,2);
	System.out.println("Final result is "+divresult2);
}
}
