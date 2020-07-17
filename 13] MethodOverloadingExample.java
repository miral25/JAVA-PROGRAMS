class area1
{
	void area(int r)
	{
		System.out.println("Area of Circle" + (3.14 * r * r));
	}
	
	void area(int l, int b)
	{
		System.out.println("Area of Rectangle" + (l*b));
	}
}

class MethodOverloadingExample
{
	public static void main(String args[])
	{
		area1 a = new area1();
		a.area(5);
		a.area(3,12);
	}
}