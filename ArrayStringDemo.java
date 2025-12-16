import java.util.*;
class ArrayStringDemo
{
	public static void main(String args[])
	{

		ArrayList l1 = new ArrayList();
		l1.add(20);
		l1.add(40);
		l1.add(15);
		l1.add(33);

		ArrayList l2 = new ArrayList();
		l2.add("Nilesh");
		l2.add("Sandip");
		l2.add("Ganesh");
		l2.add("Santosh");
		
		System.out.println("Original List:" +l2);
		Collections.sort(l2);
		System.out.println("Sorted List:" +l2);

		l2.remove("Sandip");
		System.out.println(l2);

		l1.addAll(l2);
		System.out.println("After AddAll:"+l1);
		l1.removeAll(l2);
		System.out.println("After RemoveAll l2 elements:" +l1);
		
	
	}
}