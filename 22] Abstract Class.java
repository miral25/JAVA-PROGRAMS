// Abstract Class

abstract class A
{
	abstract void show();
	
	void display()
	{
		System.out.println("This is non-abstracted method display() of abstract class A");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("This is abstracted method overridden in subclass B");
	}
}

class AbstractDemo
{
	public static void main(String args[]) 
	{
		B b = new B();
		b.show();
		b.display();
	}
}