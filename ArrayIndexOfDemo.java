import java.util.*;
class ArrayIndexOfDemo
{
	public static void main(String args[])
	{

		ArrayList l1 = new ArrayList();
		l1.add(20);
		l1.add(40);
		l1.add(15);
		l1.add(33);
		l1.add(72);
		System.out.println("L1:"+l1);
		System.out.println("Index of 72:" +l1.indexOf(72));
		System.out.println("78 is avilable in l1:"+l1.contains(33));
		System.out.println("48 is avilable in l1:"+l1.contains(43));
		l1.clear();
		System.out.println("L1:"+l1);

	}
}