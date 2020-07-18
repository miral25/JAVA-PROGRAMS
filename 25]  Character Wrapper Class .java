// Character wrapper class 
class CharacterDemo
{
	public static void main(String args[]) 
	{
		char n[] = {'b', '7', '#', 'D', ' '};
		for(int i = 0; i<n.length; i++)
		{	
			if(Character.isDigit(n[i]))
			{	
				System.out.println(n[i] + " is a Digit");
			}
			if(Character.isLetter(n[i]))
			{	
				System.out.println(n[i] + " is a Letter");
			}
			if(Character.isWhitespace(n[i]))
			{	
				System.out.println(n[i] + " is a White Space");
			}
			if(Character.isUpperCase(n[i]))
			{	
				System.out.println(n[i] + " is Upper Case");
			}
			if(Character.isLowerCase(n[i]))
			{	
				System.out.println(n[i] + " is Lower Case");
			}
		}
		
		char a = 'h';
		char a1;
		char b = 'W';
		char b1;
		char c = 'e';
		char c1;
		
		a1 = Character.toUpperCase(a);  
		b1 = Character.toLowerCase(b);  
		c1 = Character.toTitleCase(c);  
		System.out.println("\n\n");
		System.out.println(a + " converted to Upper Case is: " + a1);
		System.out.println(b + " converted to Lower Case is: " + b1);
		System.out.println(c + " converted to Title Case is: " + c1);
	}
}