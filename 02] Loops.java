class Loops
{
	public static void main(String args[])
	{
		// For Loop	
		System.out.println("For Loop:");
		for(int i=0; i<10; i++)
		{
			System.out.print(i + " ");
		}
		
		// While Loop
		System.out.println("\n\nWhile Loop:");
		int i = 0;
		while(i<=5)
		{
			System.out.print(i + " ");
			i++;
		}
		
		// Do...while Loop
		System.out.println("\n\nDo...while Loop:");
		i = 0;
		do{
			System.out.print(i + " ");
		} while(i<0);
	}
}