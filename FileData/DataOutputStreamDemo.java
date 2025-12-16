import java.io.*;
class DataOutputStreamDemo
{
	public static void main(String args[])
	{
		try
		{
		FileOutputStream fout = new FileOutputStream("C:\\Java_Problems\\FileData\\test5.txt");

		DataOutputStream dout = new DataOutputStream(fout);
		dout.writeInt(65);
		dout.flush();
		dout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Successful....Write");
	}
}
