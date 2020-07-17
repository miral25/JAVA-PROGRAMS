class Animal{}

class InstanceOfExample extends Animal
{
	public static void main(String args[])
	{
		// Example 1
		InstanceOfExample i = new InstanceOfExample();
		System.out.println(i instanceof InstanceOfExample);
		
		// Example 2
		InstanceOfExample a = new InstanceOfExample();
		System.out.println(a instanceof Animal);
		
	}
}