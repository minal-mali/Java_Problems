class ThreadDemo3 extends Thread
{
	public void run()
	{
		System.out.println("Thread Executed");
	}
	public static void main(String args[])
	{
		ThreadDemo3 t1 = new ThreadDemo3();
		t1.start();
	}
}