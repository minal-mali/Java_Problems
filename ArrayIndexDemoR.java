class ArrayIndexDemoR
{
	public static void main (String args[])
	{
		int[] numbers = {1,2,3,4,5};
		System.out.println("Welcome to Exception Handling");
		try
		{
			numbers[8]=50;
			//int i = 10;
			//System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}