import java.io.FileReader;
class FileNotFoundDemo
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr = new FileReader("missing.txt");
		}
		catch(exception e)
		{
			System.out.println(e);
		}
	}
}