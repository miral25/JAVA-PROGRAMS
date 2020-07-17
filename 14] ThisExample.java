// This keyword avoids instance variable hiding
class This1
{
	int a;
	void assign(int a)
	{
		this.a = a;
		System.out.println("Value of a: " + this.a);
	}
}

class ThisExample
{
	public static void main(String args[])
	{
		This1 t1 = new This1();
		t1.assign(4);
	}
}