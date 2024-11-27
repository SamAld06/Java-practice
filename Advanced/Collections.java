package Advanced;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.PriorityQueue;

public class Collections {
    public static void main(String[] args) {
        arrayList(args);
        linkedList(args);
        hashSet(args);
        hashMap(args);
        treeSet(args);
        priorityQueue(args);
    }
    public static void arrayList(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        for (String fruit : list) {
            System.out.print(fruit);
        }
    }
    public static void linkedList(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    public static void hashSet(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");//Duplicates dont get added!
        for (String language : set) {
            System.out.println(language);
        }
    }
    public static void hashMap(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        for (Integer key : map.keySet()) {
            System.out.println("Key: "+ key + ", Value: " + map.get(key));
        }
    }
    public static void treeSet(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        for (int number : set) {
            System.out.println(number);
        }
    }
    public static void priorityQueue(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
