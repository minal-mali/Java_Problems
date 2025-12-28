import java.util.*;
class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Ritika");
		l1.add("Mrunal");
		l1.add("Nayana");
		l1.add("Sanika");
		l1.add("Ritu");
		
		l1.addFirst("Hemakshi");//add element at the first position
		l1.addLast("Ruchika");//add element at the Last position
		l1.push("Chiku");//add element at the first position
		System.out.println("Linked List:"+ l1);

		System.out.println("Element at 5th index:"+ l1.get(5));
		System.out.println("First Element :"+ l1.getFirst());
		System.out.println("Last Element :"+ l1.getLast());
		
		System.out.println("Returns First Element:"+ l1.peek());
		System.out.println("Returns First Element :"+ l1.peekFirst());
		System.out.println("Returns Last Element :"+ l1.peekLast());
	}
}
//What is linkedList 
//Types of linkedlist- Singly,doubly,circular
// methods of linkedlist
//remove(),remove(index),removeFirst(),removeLast()
//poll(),pollfirst(),polllast()
//contains()
