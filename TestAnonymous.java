abstract class Anonymous
{
	abstract void run();
}
class TestAnonymous
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