// super() as this in general form super.member
class A
{
	int k;
}

class B extends A
{
	int k;
	
	B(int a, int b)
	{
		super.k = a;
		k = b;
	}
	
	void display()
	{
		System.out.println("K of Super Class: " + super.k);
		System.out.println("K of SubClass: " + k);
	}
}

class SuperExample3
{	
	public static void main(String args[]) 
	{
		B b = new B(11,22);
		b.display();
	}
}