import java.util.*;
class ArrayListTest
{
    public static void main(String args[])
    {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
	l1.add(30);
        l1.add(20);
        l1.add(70);
        l1.add(40);
        l1.add(50);
	System.out.println(l1);
	Iterator itr = l1.iterator();
	while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
	l1.set(3, 60);
	System.out.println("New Element : " + l1);
	System.out.println("Element at 2nd position : " + l1.get(2));
	Collections.sort(l1);
	System.out.println("Element of list : " + l1);
	System.out.println("Remove Elements of list at specific index : " + l1.remove(4));
	System.out.println("Return index of Element : " + l1.indexOf(70));
	System.out.println("list Contains Element : " + l1.contains(50));
	System.out.println("list is empty : " + l1.isEmpty());
	System.out.println("Size of list : " + l1.size());
	List<Integer> sub = l1.subList(1, 3);
        System.out.println("sub list of original list : " + sub);
	Integer arr[] = {20, 40, 60, 80, 100};
        List<Integer> l2 = Arrays.asList(arr);
        System.out.println(l2);
	ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.addAll(l1);
        newList.addAll(l2);
        System.out.println("New Array list : " + newList);
	newList.removeAll(l2);
        System.out.println("After removing all new added elements : " + newList);
    }
}
