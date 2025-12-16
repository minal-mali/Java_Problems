import java.io.*;
class BufferedOutputStreamDemo
{
	public static void main(String args[])
	{
		try
		{
		FileOutputStream fout = new FileOutputStream("C:\\Java_Problems\\FileData\\test.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome to BufferedStream";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("File Write Successfull");
	}
}
//write a difference between fileoutputstream and bufferedoutputstream?