import java.util.*;
class TestList
{
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList();
		l1.add(101);
		l1.add("RAM");
		l1.add("Male");
		l1.add("Pune");
		l1.add(99.99);

		System.out.println(l1);

		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}