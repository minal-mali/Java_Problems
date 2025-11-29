import java.io.FileOutputStream;
public class FileOutputStreamTest
{
	public static void main(String args[])
	{
		try{
			FileOutputStream fs = new FileOutputStream("C:\\Java_Problems\\File Data\\test.txt");
			fs.write(65);
			fs.close();
			System.out.println("Success....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}