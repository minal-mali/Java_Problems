import java.util.*;
class VectorTest
{
    public static void main(String args[])
    {
        Vector<Integer> v1 = new Vector<>();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        System.out.println("Vector elements : " + v1);
        System.out.print("Enumeration elements : ");
        Enumeration<Integer> e = v1.elements();
        while (e.hasMoreElements())
        {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();
        System.out.println("Element at index 2 : " + v1.elementAt(2));
        v1.removeElementAt(0);
        System.out.println("Remove First Element : " + v1);
        v1.removeElementAt(3);
        System.out.println("Remove element at index 3 : " + v1);
        System.out.println("Index of 40 : " + v1.indexOf(40));
        System.out.println("Size of vector : " + v1.size());
        v1.set(2, 70);
        System.out.println("After set at index 2 : " + v1);
        System.out.println("Element at index 3 : " + v1.get(1));
        System.out.println("Is vector empty? : " + v1.isEmpty());
        System.out.println("Capacity of vector : " + v1.capacity());
        Vector<Integer> v2 = (Vector<Integer>) v1.clone();
        v2.add(100);
        System.out.println("Original Vector : " + v1);
        System.out.println("Clone Vector : " + v2);
        v1.clear();
        System.out.println("After clear v1 : " + v1);
    }
}
