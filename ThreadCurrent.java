class ThreadCurrent extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		ThreadCurrent t1 = new ThreadCurrent();
		ThreadCurrent t2 = new ThreadCurrent();
		ThreadCurrent t3 = new ThreadCurrent();
		t1.start();
		t2.start();
		t3.start();
		t1.setName("MINAL");
		


	}
}
