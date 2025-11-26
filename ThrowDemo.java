class ThrowDemo
{
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException ("this person is not allowed to vote"); //Checked Exception
		}
		else
		{
			System.out.println("valid voting age");
		}
	}
	public static void main(String args[])
	{
		try
		{
			validate(17);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code....");
	}
}