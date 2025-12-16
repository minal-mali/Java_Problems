import java.io.*;
class ReadTestDemo
{
	public static void main(String args[])
	{
		try
		{
			File f1 = new File("C:\\Java_Problems\\FileData\\demo.txt");	
			if(f1.createNewFile())
			{
				System.out.println("File" + f1.getName() + "File created Successfully");
			}
			else
			{
				System.out.println("File already Exists");
			}
			System.out.println("Is file Readable:" +f1.canRead());
			System.out.println("Is file Writable:" +f1.canWrite());
			System.out.println("Is file Executable:" +f1.canExecute());

			//f1.setReadable(false);
			//f1.setWritable(false);
			//f1.setExecutable(true);

			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}