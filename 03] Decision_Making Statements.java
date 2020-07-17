class DecisionMaking
{
	public static void main(String args[])
	{
		int a = 5;
		int b = 10;
		
		// if-else
		if(a<b)
		{
			System.out.println("B is greater than A");
		}
		else
		{
			System.out.println("A is greater than B\n");
		}
		
		// if-else ladder [else if]
		int roll[] = {1,2,3,4};
		int marks[] = {60,80,55,43};
		for(int i=0; i<roll.length; i++)
		{
			if(marks[i]>79)
			{
				System.out.println(roll[i] + " : Honour");
			}
			else if(marks[i]>59)
			{
				System.out.println(roll[i] + " : First Class");
			}
			else if(marks[i]>49)
			{
				System.out.println(roll[i] + " : Second Class");
			}
			else
			{
				System.out.println(roll[i] + " : Fail");
			}
		}
		
		// switch case
		int i=2;
		switch(i)
		{
			case 1: 
				System.out.println("\nSwitch Case 1");
				break;	
				
			case 2: 
				System.out.println("\nSwitch Case 2");
				break;	
		}
	}
}