interface A
{
	public void show();
	interface B
	{
		public void display();
	}
}
class TestNestedInterface implements A.B
{
	public void display()
	{
		System.out.println("Overriding method of nested interface");
	}
	public static void main (String args[])
	{
		A.B obj1 = new TestNestedInterface();
		obj1.msg();
	}
}