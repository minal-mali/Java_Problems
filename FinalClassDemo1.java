final class FinalClassDemo1
{
	void display()
	{
		System.out.println("Final class of parent class");
	}
}
class FinalClassDemo extends FinalClassDemo1
{
	void display()
	{
		System.out.println("Final class of child class");
	}
	
	public static void main (String args[])
	{
		FinalClassDemo f1  = new FinalClassDemo();
		f1.display();
	}
}
