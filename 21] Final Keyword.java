// Final keyword
// 1. To declare a variable as constant
// 2. To prevent Method Overriding
// 3. To prevent Inheritance [A class declared as final cannot be inherited eg. final class A]

final class A
{
	final int size = 100;
	
	final void show()
	{
		System.out.println("In show() of A");
	}
}

class B extends A
{
	void show() // cannot override because it is declared as final
	{
		System.out.println("In show() of B");
	}
}