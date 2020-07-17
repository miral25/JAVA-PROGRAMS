class VariablesAndTernaryOperator
{
	public static void main(String args[])
	{
		// Variables
		int a = 100;
		float b = 20.22f;
		char c = 'a';
		double d = 333.555;
		boolean e = true;
		System.out.println("Integer: " + a);
		System.out.println("Float: " + b);
		System.out.println("Char: " + c);
		System.out.println("Double: " + d);
		
		if(!e)
		{
			System.out.println("Boolean if: " + e);
		}
		else
		{
			System.out.println("Boolean else: " + e);
		}	
		
		// Ternary/Conditional Operator
		int f = 10;
		int g;
		g = f>5?12:20;
		System.out.println(g);
	}
}