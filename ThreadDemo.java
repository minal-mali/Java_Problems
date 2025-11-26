class ThreadDemo implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running.....");
	}
	public static void main (String args[])
	{
		ThreadDemo t1 = new ThreadDemo();
		Thread t2 = new Thread(t1);
		t2.start();//t2.run();
		
	}
}