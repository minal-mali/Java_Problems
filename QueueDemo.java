import java.util.*;
class QueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue<String> pg = new PriorityQueue<String>();
		pg.add("Apple");
		pg.add("Banana");
		pg.add("Orange");
		pg.add("Grapes");

		pg.offer("Kiwi");
		System.out.println(pg);
		System.out.println("Head of Queue:" +pg.peek());
		System.out.println("Another Head of Queue:" +pg.element());
		System.out.println("Remove Element:" +pg.remove());
		System.out.println("Poll of Queue:" +pg.poll());

	}
}
//What is Queue and type of priority queue