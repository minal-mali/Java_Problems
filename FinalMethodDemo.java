class FinalMethodDemo1
{
	final void display()
	{
		System.out.println("Final method of parent class");
	}
}
class FinalMehtodDemo extends FinalMethodDemo1
{
	void display()
	{
		System.out.println("Final method of child class");
	}
	
	public static void main (String args[])
	{
		FinalMethodDemo f1  = new FinalMethodDemo();
		f1.display();
	}
}
