class tryCatchFinally
{
	public static void main(String args[])
	{
		try{
			int data = 10/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block always executes");
		}
		System.out.println("Rest of the code of the program");
	}
}