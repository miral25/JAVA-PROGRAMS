//WAP to accept a number using Command Line Argument and print the number as Odd or Even
class OddEven
{
	public static void main(String args[])
	{
		int x = Integer.parseInt(args[0]);
		if(x%2 == 0)
		{
			System.out.println(x + " is Even Number");
		}
		else
		{
			System.out.println(x + " is odd Number");
		}
	}
}