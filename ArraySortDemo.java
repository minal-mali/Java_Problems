import java.util.*;
class ArraySortDemo
{
	public static void main(String args[])
	{
		ArrayList l3 = new ArrayList();
		l3.add(10);
		l3.add(34);
		l3.add(67);
		l3.add(20);
		
		System.out.println("Original List:" +l3);
		Collections.sort(l3);
		System.out.println("Sorted List:" +l3);
	}
}