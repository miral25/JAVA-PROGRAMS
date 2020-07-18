// Static Variable and Method Example
class StaticExample
{  
	static int count = 0;
	  
	StaticExample() // For Static Variable
	{  
		count++;
		System.out.println(count);  
	}  
	
	static int cube(int x) // For Static Method
	{  
	  return x*x*x;  
	 }  
	  
	public static void main(String args[])
	{  
	StaticExample c1 = new StaticExample();  
	StaticExample c2 = new StaticExample();  
	StaticExample c3 = new StaticExample();  
	
	int result = StaticExample.cube(5);  
	System.out.println("\nCube: " + result);  
	}  
}  