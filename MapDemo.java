import java.util.*;


class MapDemo{

	public static void main(String args[])
	{
		HashMap m1=new HashMap();
		m1.put(1,"Ram");
		m1.put(2,"Krishna");
		m1.put(3,"Bramha");
		m1.put(4,"Mahadeva");

		System.out.println(m1);

		Set s=m1.entrySet();

		Iterator itr=s.iterator();

		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		LinkedHashMap m2=new LinkedHashMap();
		m2.put(1,"Ram");
		m2.put(2,"Krishna");
		m2.put(3,"Bramha");
		m2.put(4,"Mahadeva");

		System.out.println(m2);

		Set s1=m2.entrySet();

		Iterator itr1=s1.iterator();

		while(itr1.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		TreeMap t1=new TreeMap();
		t1.put(1,"Ram");
		t1.put(2,"Krishna");
		t1.put(3,"Bramha");
		t1.put(4,"Mahadeva");

		System.out.println(t1);

		Set s2=t1.entrySet();

		Iterator itr2=s2.iterator();

		while(itr2.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr2.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		

	}
}