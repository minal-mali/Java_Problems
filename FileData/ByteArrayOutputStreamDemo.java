import java.io.*;
class ByteArrayOutputStreamDemo
{
	public static void main(String args[])
	{
		try
		{
		FileOutputStream fout1 = new FileOutputStream("C:\\Java_Problems\\FileData\\test1.txt");
		FileOutputStream fout2 = new FileOutputStream("C:\\Java_Problems\\FileData\\test2.txt");
		FileOutputStream fout3 = new FileOutputStream("C:\\Java_Problems\\FileData\\test3.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(100);

		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.writeTo(fout3);

		bout.flush();
		bout.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Successful....Write");
	}
}
