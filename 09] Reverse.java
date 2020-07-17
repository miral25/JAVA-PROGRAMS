// Define a class having one 3 digit number, num as data member, initialize and display reverse of that number
class Reverse
{
	public static void main(String args[])
	{
		int num = 123;
		int q,r;
		System.out.println("Reverse of 123: ");
		for(int i=0;i<3;i++)
		{
			q = num/10;
			r = num%10;
			System.out.print(r);
			num = q;
		}
	}
}