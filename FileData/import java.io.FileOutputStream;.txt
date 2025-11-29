import java.io.FileOutputStream;
public class FileOutputTest
{
	public static void main(String args[])
	{
		try{
			FileOutputStream fs = new FileOutputStream("C:\\Java_Problems\\FileData\\file.txt");
			String s = "My name is Minal Mali";
			byte b[] = s.getBytes();
			fs.write(b);
			fs.close();
			System.out.println("Program Successfully run.....");
		}
		catch(Exception e)
		{System.out.println(e);}
	}

}