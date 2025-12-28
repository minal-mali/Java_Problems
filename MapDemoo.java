import java.util.*;

class MapDemoo {

    public static void main(String args[]) {

        // HashMap
        HashMap<Integer, String> m1 = new HashMap<>();
        m1.put(1, "Ram");
        m1.put(2, "Krishna");
        m1.put(3, "Bramha");
        m1.put(4, "Mahadeva");

        System.out.println("HashMap : " + m1);

        Set<Map.Entry<Integer, String>> s = m1.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = s.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // LinkedHashMap (Maintains insertion order)
        LinkedHashMap<Integer, String> m2 = new LinkedHashMap<>();
        m2.put(1, "Ram");
        m2.put(2, "Krishna");
        m2.put(3, "Bramha");
        m2.put(4, "Mahadeva");

        System.out.println("\nLinkedHashMap : " + m2);

        Set<Map.Entry<Integer, String>> s1 = m2.entrySet();
        Iterator<Map.Entry<Integer, String>> itr1 = s1.iterator();

        while (itr1.hasNext()) {
            Map.Entry<Integer, String> entry = itr1.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // TreeMap (Sorted order by key)
        TreeMap<Integer, String> t1 = new TreeMap<>();
        t1.put(1, "Ram");
        t1.put(2, "Krishna");
        t1.put(3, "Bramha");
        t1.put(4, "Mahadeva");

        System.out.println("\nTreeMap : " + t1);

        Set<Map.Entry<Integer, String>> s2 = t1.entrySet();
        Iterator<Map.Entry<Integer, String>> itr2 = s2.iterator();

        while (itr2.hasNext()) {
            Map.Entry<Integer, String> entry = itr2.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
	m1.remove(3);
	System.out.println(m1);
        }
    }
}
