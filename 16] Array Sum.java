import java.io.*;

class Array1
{
	static int sum = 0;
	
	public static void main(String args[]) throws IOException
	{
		int a[] = new int[10];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try
		{
			System.out.println("Enter Elements: ");
			for(int i=0; i<5; i++)
			{
				a[i] = Integer.parseInt(br.readLine());
			}
		}
		catch(Exception e)
		{}
		for(int i=0; i<5; i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Sum: " + sum);
	}
}