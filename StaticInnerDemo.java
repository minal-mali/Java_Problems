class StaticInnerDemo
{
	static int data = 100;
	static void display()
	{
		System.out.println("Calling from static Inner class");
	}
	static class Inner //static inner class
	{
		void show()
		{
			System.out.println(data);
		}
	}
	public static void main(String args[])
	{
		StaticInnerDemo.Inner d1 = new StaticInnerDemo.Inner();
		d1.show();
	}
}
//static inner class	