import java.util.*;
class LinkedListTest
{
    public static void main(String args[])
    {
	LinkedList<String> l1 = new LinkedList<>();
	l1.add("Ritu");
        l1.add("Ritika");
        l1.add("Minal");
        l1.add("Mrunal");
        l1.add("Hemakshi");
        System.out.println("Original list : " + l1);
        l1.addLast("Shruti");
        System.out.println("Add Element at last of list : " + l1);
        l1.addFirst("Payal");
        System.out.println("Add Element at first of list : " + l1);
	l1.push("Kartik");
        System.out.println("Add element at first using push() : " + l1);
        System.out.println("Retrieve First Element : " + l1.getFirst());
        System.out.println("Retrieve Last Element : " + l1.getLast());
        System.out.println("Peek First Element : " + l1.peek());
        System.out.println("Peek First Element : " + l1.peekFirst());
        System.out.println("Peek Last Element : " + l1.peekLast());
        System.out.println("Remove First Element : " + l1.removeFirst());
        System.out.println("After removing first : " + l1);
        System.out.println("Remove Specific Element  : " + l1.remove("Shubham"));
        System.out.println("After removing Lalit : " + l1);
        System.out.println("Remove Last Element : " + l1.removeLast());
        System.out.println("After removing last : " + l1);
        System.out.println("Poll (remove first) : " + l1.poll());
        System.out.println("After poll : " + l1);
        System.out.println("Contains Shubham : " + l1.contains("Lalit"));
        System.out.println("Last Index of Shyam : " + l1.lastIndexOf("Kunal"));
        System.out.println("List is Empty : " + l1.isEmpty());
        System.out.println("Size of list : " + l1.size());
    }
}
