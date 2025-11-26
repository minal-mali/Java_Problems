class FinalVariableDemo
{
	final int no=5;
	void display()
	{
		System.out.println("Value of no:" + no);

		// no = 200;
		System.out.println("Value of no:" + no);
	}
	public static void main (String args[])
	{
		FinalVariableDemo f1  = new FinalVariableDemo();
		f1.display();
	}
}