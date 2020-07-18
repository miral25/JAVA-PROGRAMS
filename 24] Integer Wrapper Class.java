// Integer wrapper class 
class IntegerDemo
{
	public static void main(String args[]) 
	{
		int n = 10;
		System.out.println(n + " in binary " + Integer.toBinaryString(n));
		System.out.println(n + " in octal " + Integer.toOctalString(n));
			System.out.println(n + " in hexadecimal " + Integer.toHexString(n));
	}
}