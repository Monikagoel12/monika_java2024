package package2;

public class Constructor_4feb {

	public Constructor_4feb()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public Constructor_4feb(int a)
	{
		System.out.println("One Parametrized Constructor");
	}
	public Constructor_4feb(int a, int b)
	{
		System.out.println("Two Parametrized Constructor");
	}
	public Constructor_4feb(int a, int b, int c)
	{
		System.out.println("Three Parametrized Constructor");
	}
	public Constructor_4feb(int a, int b , int c, int d)
	{
		this(4,6);
		System.out.println("Four Parametrized Constructor");
	}
	
	public static void main(String[] args)
	{
		Constructor_4feb ob = new Constructor_4feb();
		Constructor_4feb ob1 = new Constructor_4feb(1);
		Constructor_4feb ob2 = new Constructor_4feb(2,7,8,9);
		
	}
}
