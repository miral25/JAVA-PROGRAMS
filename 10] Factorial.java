import java.io.*;

class Factorial
{
	public static void main(String args[]) throws IOException
	{
		int fact = 1;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a number: ");
		int num = Integer.parseInt(br.readLine());
		for(int i = 1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " : " + fact);
	}
}