import java.util.*;
class ScannerTestAge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner("My age is 37 years");
		while(sc.hasNext())
		{
			if(sc.hasNextInt())
				System.out.println(sc.next());
			else
				sc.next();
		
		}
	}
}