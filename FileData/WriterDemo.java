import java.io.*;
class WriterDemo
{
	public static void main(String args[])
	{
		try
		{
			Writer w = new FileWriter("output.txt");
			String content = "I like to travel in Mumbai\n";
			w.write(content);
			w.append("I like to travel in India");
			w.close();
			System.out.println("Write Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}