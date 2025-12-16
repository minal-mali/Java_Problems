import java.util.*;
class ScannerTestDemo1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner("Hello Minal Mali\n You are trainer\n You love Mumbai"); //Hello Minal 													Mali
		while(sc.hasNextLine()) //sc.hasNext
		{
			System.out.println(sc.nextLine()); //sc.next()
		
		}
	}
}