class ThreadDemo5 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		ThreadDemo5 t1 = new ThreadDemo5();
		ThreadDemo5 t2 = new ThreadDemo5();
		ThreadDemo5 t3 = new ThreadDemo5();
		t1.start();
		try{
			t1.join();//t2.join();//t3.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
		

	}
}
