interface Anonymous1
{
	void run();
}
class TestAnonymous1
{
	public static void main(String args[])
	{
		Anonymous a1 = new Anonymous()
		{
			void run()
			{
				System.out.println("Anonymous Class");
			}
		};
		a1.run();
	}
}
//using interface
//what is anonymous class and concept of anonymous class