class ThreadName extends Thread
{
	public void run()
	{
		System.out.println("Thread Executed...");
	}
	public static void main(String args[])
	{
		ThreadName t1 = new ThreadName();
		ThreadName t2 = new ThreadName();
		ThreadName t3 = new ThreadName();
		System.out.println("Name of Thread1 :" + t1.getName());
		System.out.println("Name of Thread2 :" + t2.getName());
		System.out.println("Name of Thread2 :" + t3.getName());
		t1.start();
		t2.start();
		t3.start();
		t1.setName("BALVAT");
		System.out.println("Name of Thread1 :" + t1.getName());
		System.out.println("Name of Thread2 :" + t2.getName());
		System.out.println("Name of Thread2 :" + t3.getName());


	}
}
