class DemonThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Demon Thread executed");

		System.out.println("User Thread executed");

	}
	public static void main(String args[])
	{
		DemonThreadDemo t1 = new DemonThreadDemo();
		DemonThreadDemo t2 = new DemonThreadDemo();
		DemonThreadDemo t3 = new DemonThreadDemo();


	}
}