// Dynamic Method Dispatch
// Which overridden method to call is decided on runtime 
// Implements runtime polymorphism

class A
{
	void callme()
	{
		System.out.println("Inside A's callme method");
	}
}

class B extends A
{
	void callme() // override callme()
	{
		System.out.println("Inside B's callme method");
	}
}

class C extends A
{
	void callme() // override callme()
	{
		System.out.println("Inside C's callme method");
	}
}

class DD
{
	public static void main(String args[]) 
	{
		A a = new A();
		B b = new B();
		C c = new C();
		A r; // Obtain a reference of type A
		r = a; // r refers to A object
		r.callme(); // calls A's version of callme()
		r = b; // r refers to B object
		r.callme(); // calls B's version of callme()
		r = c; // r refers to C object
		r.callme(); // calls C's version of callme()
	}
}