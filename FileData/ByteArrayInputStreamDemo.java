import java.io.*;
class ByteArrayInputStreamDemo
{
	public static void main(String args[])
	{
		try
		{
		byte[] buf = {42,43,44,45};

		ByteArrayInputStream bout = new ByteArrayInputStream(buf);
		int k=0;

		while((k=bout.read())!=-1)	
		{
			char ch = (char)k;
			System.out.println("ASCII value of character is:" + k + " The Special Character: " +ch);
		}

		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Successful....Write");
	}
}
