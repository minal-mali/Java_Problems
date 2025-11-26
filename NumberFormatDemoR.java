class NumberFormatDemoR
{
	public static void main (String args[])
	{
		String s = "Minal";
		System.out.println("Welcome to Exception Handling");
		try
		{
			int no=Integer.parseInt(s);
			System.out.println(no);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}