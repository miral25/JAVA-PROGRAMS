class A
{
	int i,j;
	
	A()
	{
		i = 11;
		j = 22;
	}
	
	void show()
	{
		System.out.println("Value of i: " + i);
		System.out.println("Value of j: " + j);
	}
	
	void display() 
	{
		System.out.println("Value of i: " + i);
		System.out.println("Value of j: " + j);
	}
}

class B extends A
{
	int k;
	
	B()
	{
		super();
		k = 33;
	}
	
	void show() // super keyword used for show method to prevent method overriding
	{
		super.show();
		System.out.println("Value of k: " + k);
	}
	
	void display() // Overridden Method
	{
		System.out.println("\n\nOverriden Method displays only class B");
		System.out.println("Value of k: " + k);
	}
}

class MethodOverridingExample
{
	public static void main(String args[]) 
	{
		B b = new B();
		b.show();
		b.display();
	}
}