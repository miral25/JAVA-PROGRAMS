// super() as super(parameter list);
// When subclass needs a reference to its immediate superclass, it can do so using keyword super
// 1. First calls the superclass's constructor
// 2. Second is used to access a member of superclass that has been declared as private
class A
{
	private int i,j;
	A()
	{
		i = 10;
		j = 20;
		System.out.println(i +" "+j);
	}
	
	A(int i1, int j1)
	{
		i = i1;
		j = j1;
		System.out.println(i +" "+j);
	}
}

class B extends A
{
	int k;
	B()
	{
		super();
		k = 30;
		System.out.println(k);
	}
	
	B(int i2, int j2, int k1)
	{
		super(i2,j2);
		k = k1;
		System.out.println(k);
	}
}

class SuperExample1
{	
	public static void main(String args[]) 
	{
		B ob1 = new B();
		B ob2 = new B(11,22,33);
	}
}