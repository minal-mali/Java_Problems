class MinalException extends Exception
{
	public MinalException(String str)
	{
		super(str);
	}
}
public class CustomExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			throw new MinalException("This is my custom Exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code....");
	}
}