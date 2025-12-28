import java.util.*;
class ArrayDqDemo
{
    public static void main(String args[])
    {
        ArrayDeque<String> pq = new ArrayDeque<String>();

        pq.add("Apple");
        pq.add("Banana");
        pq.add("Orange");
        pq.add("Grapes");

        pq.offer("Kiwi");
        System.out.println("After Offer: " + pq);

        pq.offerFirst("Mango");
        System.out.println("After Offer First: " + pq);

        pq.offerLast("Pineapple");
        System.out.println("After Offer Last: " + pq);

        System.out.println("Remove Element: " + pq.remove());
        System.out.println("After Remove: " + pq);

        System.out.println("After Poll: " + pq.poll());
        System.out.println("After PollLast: " + pq.pollLast());

        System.out.println("Final Deque: " + pq);
    }
}
