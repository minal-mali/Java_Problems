import java.util.*;
class InputTestDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message:");
		String message = sc.nextLine();
		System.out.println("Your message is:" + message);
		sc.close();
	}
}