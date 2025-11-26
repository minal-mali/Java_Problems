class ThreadDemo4 extends Thread
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
		ThreadDemo4 t1 = new ThreadDemo4();
		ThreadDemo4 t2 = new ThreadDemo4();
		t1.start();//t1.run();
		t2.start();//t2.run();
	}
}
//What is we call run() directly? instead of start() mehtod
//what is sleep method
//what is the use join()