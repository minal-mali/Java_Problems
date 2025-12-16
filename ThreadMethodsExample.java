class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread Name:"+ getName());
		System.out.println("Thread Priority:"+ getPriority());
	}
}
class ThreadMethodsExample
{
	public static void main(String args[])
	{
	MyThread t1 = new MyThread();
	MyThread t2 = new MyThread();

	t1.setName("CHIKU");
	t2.setName("CHIA");
	
	t2.setPriority(Thread.MIN_PRIORITY);
	t1.setPriority(Thread.MAX_PRIORITY); 
        

	t1.start();
	t2.start();
	}
}