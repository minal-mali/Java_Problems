class ThreadCurrent1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		ThreadCurrent1 t1 = new ThreadCurrent1();
		ThreadCurrent1 t2 = new ThreadCurrent1();
		ThreadCurrent1 t3 = new ThreadCurrent1();

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());

		t2.setPriority(8);
		t1.setPriority(3);
		t3.setPriority(9);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.start();
		t2.start();
		t3.start();

		System.out.println(Thread.currentThread().getName());							System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());

		
	}
}
//order of execution but its no guaranted(1-10)
//1-lowest
//10-highest
//5- normal

