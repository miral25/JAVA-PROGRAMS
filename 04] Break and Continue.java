class BreakContinue
{
	public static void main(String args[])
	{
		// Break
		System.out.println("\nExample of Break:");
		for(int i=0; i<10; i++)
		{
			if(i==5){
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("\nWill break at 5");
		
		// Continue
		System.out.println("\nExample of Continue:");
		for(int i=0; i<10; i++)
		{
			if(i==6){
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println("\nWill continue and skip 6");
	}
}