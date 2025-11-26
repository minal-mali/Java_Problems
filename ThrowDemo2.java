import java.io.*;
class ThrowDemo2
{
	public static void show()throws FileNotFoundException //Checked Exception
	{
		FileReader fr = new FileReader("C:\\user\\desktop\\abc.txt");
		throw new = FileNotFoundException();
	}
	public static void main(String args[])
	{
		try
		{
			show();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code....");
	}
}
//throws - declaring an exception , which inform programmer that he has to use exception handling