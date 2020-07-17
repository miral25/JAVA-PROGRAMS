class MathFunctions
{
	public static void main(String args[])
	{
		int a = 5;
		int b = 10;
		int c = 25;
		int d = 3;
		double e = 245.678;
		int f = -45;
		
		// Math.min()
		System.out.println("\nMinimum Value: " + Math.min(a,b));
		
		// Math.max()
		System.out.println("\nMaximum Value: " + Math.max(a,b));
		
		// Math.sqrt()
		System.out.println("\nSquare Root of 25: " + Math.sqrt(c));
		
		// Math.pow()
		System.out.println("\nRaised to Power: " + Math.pow(a,d));
		
		// Math.exp()
		System.out.println("\nExponential of 5: " + Math.exp(a));
		
		// Math.round()
		System.out.println("\nRound of 245.678: " + Math.round(e));
		
		// Math.abs()
		System.out.println("\nAbsolute value of -45: " + Math.abs(f));
		
	}
}