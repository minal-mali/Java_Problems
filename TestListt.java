import java.util.*;
class TestListt
{
	public static void main(String args[])
	{
		ArrayList l1 = new ArrayList();
		l1.add(101);
		l1.add("RAM");
		l1.add("Male");
		l1.add("Pune");
		l1.add(99.99);
		l1.add("Pune");

		l1.add(1,"Shyam"); 	// l1.add(int index,element)
		l1.add(0,1000);

		ArrayList l2 = new ArrayList();
		l2.add("Barsana");
		l2.add("Radha");
		l2.add(20000);
		
		l2.addAll(l2);	//adding data from another collection

		System.out.println(l1);

		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		l1.set(3,"Rambhau"); //replace element at specific position
		System.out.println(l1);
	}
}