import java.util.*;
class TreeDemo
{
	public static void main(String args[])
	{
		TreeSet<Integer> t1 = new TreeSet <Integer>();
		t1.add(5);
		t1.add(20);
		t1.add(30);
		t1.add(40);
		t1.add(50);

		System.out.println("TreeSet:"+t1);
		System.out.println("Floor of 15:"+t1.floor(15));
		System.out.println("Ceiling of 25:"+t1.ceiling(25));
		
	}
}