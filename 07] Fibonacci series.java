class Fibonacci
{
	public static void main(String args[])
	{
		int ft = 0;
		int st = 1;
		int tt;
		int n = 10;
		System.out.println("\nFibonacci Series: ");
		System.out.print(ft);
		System.out.print(" " + st);
		for(int i=2;i<n;i++)
		{
			tt = ft + st;
			System.out.print(" " + tt);
			ft = st;
			st = tt;
		}
	}
}