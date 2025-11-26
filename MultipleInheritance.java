abstract class Mini
{
	abstract void run();
}
class MultipleInheritance
{
	public static void main(String args[])
	{
		Mini m = new Mini()
		{
			public void run()
			{
				System.out.println("This is Anonymous Class");
			}
		};
		m.run();
	}
}
