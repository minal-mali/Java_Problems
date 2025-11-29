import java.io.FileInputStream;
public class FileInputTest
{
	public static void main (String args[])
	{
		try
		{
			FileInputStream fs = new FileInputStream("C:\\Java_Problems\\FileData\\file.txt");
			int i;
			while((i=fs.read())!=-1)
			{
				System.out.println((char)i);
			}
			fs.close(); //frees the system resource
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}