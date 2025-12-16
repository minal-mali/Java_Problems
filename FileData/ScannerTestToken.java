import java.util.*;
class ScannerTestToken
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner("My age is 37 years");
		Boolean hasNextToken = sc.hasNext();

		System.out.println("Does my string contains next token?:" + hasNextToken);
	}
}