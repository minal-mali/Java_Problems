import java.util.*;
class TreeTest
{
	public static void main(String args[])
	{
		TreeSet<Integer> t1 = new TreeSet <Integer>();
		t1.add(33);
		t1.add(22);
		t1.add(11);
		t1.add(88);
		t1.add(44);
		t1.add(66);
		t1.add(55);
		t1.add(77);
		System.out.println("Default in Ascending order:"+t1);
		t1.pollFirst();
		t1.pollLast();
		System.out.println("TreeSet after poll:"+t1);
		System.out.println("TreeSet in descending order:"+t1.descendingSet());
		System.out.println("HeadSet:"+t1.headSet(55,true));
		System.out.println("TailSet:"+t1.tailSet(55,false));
		System.out.println("SubSet:"+t1.subSet(44,true,77,true));
		System.out.println("Higher:"+t1.higher(44));
		System.out.println("Lower:"+t1.lower(44));
		
	}
}
//what is TreeSet
//Methods of TreeSet 
//pollfirst and polllast,descendingSet,higher,lower,tailset,subset,headset