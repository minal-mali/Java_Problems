import java.util.*;
class StringTokenTest
{
	public static void main(String args[])
	{
		String s1 = "Have,a,nice,day,student";
		StringTokenizer st = new StringTokenizer(s1); //separate the string
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken(","));
		}
	}
}