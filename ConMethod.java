class ConMethod
{
	void display(int a)
	{
		System.out.println("Hello from display" + a);
	}
	void show(int b)
	{
		System.out.println("Hello from show" + b);
		this.display(b);
	}
}
class Test
{
	public static void main(String args[])
	{
		ConMethod m1 = new ConMethod();
		m1.show(10);
		ConMethod m2 = new ConMethod();
		m2.display(20);
	}
}