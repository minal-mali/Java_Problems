import java.io.File;
import java.io.IOException;
class FileDemo
{
	public static void main(String args[])
	{
		try{
			File f1 = new File("C:\\Java_Problems\\FileData\\sample.txt");
			if(f1.createNewFile())
			{
				System.out.println("File " + f1.getName() + "is created successfully");
			}
			else
			{
				System.out.println("File Already Exists");
			}
			System.out.println("Path of file:" + f1.getAbsolutePath());
			System.out.println("Do we have permission to read:" + f1.canRead());
			System.out.println("Do we have permission to write" + f1.canWrite());
			System.out.println("Length of file is:" + f1.length());

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}