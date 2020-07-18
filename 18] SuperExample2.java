// super() as super(parameter list);
// When subclass needs a reference to its immediate superclass, it can do so using keyword super
// 1. First calls the superclass's constructor
// 2. Second is used to access a member of superclass that has been declared as private
class A
{
	int roll;
	String name;
	
	A(int r, String n)
	{
		roll = r;
		name = n;
	}
}

class B extends A
{
	int marks1, marks2;
	
	B(int r1, String n1, int m1, int m2)
	{
		super(r1, n1);
		marks1 = m1;
		marks2 = m2;
	}
	
	void display()
	{
		System.out.println("Roll No: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Marks1: " + marks1);
		System.out.println("Marks2: " + marks2);
	}
}

class SuperExample2
{	
	public static void main(String args[]) 
	{
		B b = new B(1,"Miral",90,88);
		b.display();
	}
}