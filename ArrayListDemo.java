import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(34);
		l1.add(67);
		l1.add(20);
		
		System.out.println(l1);
		System.out.println("Element at l1.get(2):" + l1.get(2));
	}
}