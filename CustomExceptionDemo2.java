class InvalidAgeException extends Exception
{
		public InvalidAgeException(String message)
		{
			super(message);
		}
}
public class CustomExceptionDemo2
{
	public static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Invalid Voting age "); 
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
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code....");
	}
}