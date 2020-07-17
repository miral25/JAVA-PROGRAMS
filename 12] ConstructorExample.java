class X
{
	// Default constructor
	X()
	{
		System.out.println("Constructor without argument(Default Constructor)");
	}
	
	// Parameterized constructors
	X(int a)
	{
		System.out.println("Constructor with one argument where a = " + a);
	}
	X(int a, float b)
	{
		System.out.println("Constructor with two arguments where a = " + a + " and b = " + b);
	}	
}

class ConstructorExample
{
	public static void main(String args[])
	{
		X x1 = new X();
		X x2 = new X(3);
		X x3 = new X(2,3.2f);
	}
}