import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;

public class DataStructureComparison {
    public static void main(String[] args) {
        // Insert Operation
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        System.out.println("Performing insert operation...");

        //Insertion operation for ArrayList
        long arrayListInsertionStartTime = System.nanoTime();
        performInsertOperation(arrayList);
        long arrayListInsertionEndTime = System.nanoTime();
        long arrayListInsertionTime = arrayListInsertionEndTime - arrayListInsertionStartTime;
        long arrayListInsertionMemoryUsage = measureMemoryUsage(arrayList);

        //Insertion operation for LinkedList
        long linkedListInsertionStartTime = System.nanoTime();
        performInsertOperation(linkedList);
        long linkedListInsertionEndTime = System.nanoTime();
        long linkedListInsertionTime = linkedListInsertionEndTime - linkedListInsertionStartTime;
        long linkedListInsertionMemoryUsage = measureMemoryUsage(linkedList);

        //Insertion operation for HashSet
        long hashSetInsertionStartTime = System.nanoTime();
        performInsertOperation(hashSet);
        long hashSetInsertionEndTime = System.nanoTime();
        long hashSetInsertionTime = hashSetInsertionEndTime - hashSetInsertionStartTime;
        long hashSetInsertionMemoryUsage = measureMemoryUsage(hashSet);

        //Insertion operation for TreeSet
        long treeSetInsertionStartTime = System.nanoTime();
        performInsertOperation(treeSet);
        long treeSetInsertionEndTime = System.nanoTime();
        long treeSetInsertionTime = treeSetInsertionEndTime - treeSetInsertionStartTime;
        long treeSetInsertionMemoryUsage = measureMemoryUsage(treeSet);

        //Insertion operation for HashMap
        long hashMapInsertionStartTime = System.nanoTime();
        performInsertOperation(hashMap);
        long hashMapInsertionEndTime = System.nanoTime();
        long hashMapInsertionTime = hashMapInsertionEndTime - hashMapInsertionStartTime;
        long hashMapInsertionMemoryUsage = measureMemoryUsage(hashMap);

        //Insertion operation for TreeMap
        long treeMapInsertionStartTime = System.nanoTime();
        performInsertOperation(treeMap);
        long treeMapInsertionEndTime = System.nanoTime();
        long treeMapInsertionTime = treeMapInsertionEndTime - treeMapInsertionStartTime;
        long treeMapInsertionMemoryUsage = measureMemoryUsage(treeMap);


        System.out.println("ArrayList - Insert Time: " + arrayListInsertionTime + " ns, Memory Usage: " + arrayListInsertionMemoryUsage + " bytes");
        System.out.println("LinkedList - Insert Time: " + linkedListInsertionTime + " ns, Memory Usage: " + linkedListInsertionMemoryUsage + " bytes");
        System.out.println("HashSet - Insert Time: " + hashSetInsertionTime + " ns, Memory Usage: " + hashSetInsertionMemoryUsage + " bytes");
        System.out.println("TreeSet - Insert Time: " + treeSetInsertionTime + " ns, Memory Usage: " + treeSetInsertionMemoryUsage + " bytes");
        System.out.println("HashMap - Insert Time: " + hashMapInsertionTime + " ns, Memory Usage: " + hashMapInsertionMemoryUsage + " bytes");
        System.out.println("TreeMap - Insert Time: " + treeMapInsertionTime + " ns, Memory Usage: " + treeMapInsertionMemoryUsage + " bytes");

        System.out.println("\nPerforming delete operation...");

        // Delete Operation for ArrayList
        long arrayListDeleteStartTime = System.nanoTime();
        removeElementsByValue(arrayList, 10000);
        long arrayListDeleteEndTime = System.nanoTime();
        long arrayListDeleteTime = arrayListDeleteEndTime - arrayListDeleteStartTime;
        long arrayListDeleteMemoryUsage = measureMemoryUsage(arrayList);

        // Delete Operation for LinkedList
        long linkedListDeleteStartTime = System.nanoTime();
        removeElementsByValue(linkedList, 10000);
        long linkedListDeleteEndTime = System.nanoTime();
        long linkedListDeleteTime = linkedListDeleteEndTime - linkedListDeleteStartTime;
        long linkedListDeleteMemoryUsage = measureMemoryUsage(linkedList);

        // Delete Operation for HashSet
        long hashSetDeleteStartTime = System.nanoTime();
        removeElementsByKey(hashSet, 10000);
        long hashSetDeleteEndTime = System.nanoTime();
        long hashSetDeleteTime = hashSetDeleteEndTime - hashSetDeleteStartTime;
        long hashSetDeleteMemoryUsage = measureMemoryUsage(hashSet);

        // Delete Operation for TreeSet
        long treeSetDeleteStartTime = System.nanoTime();
        removeElementsByValue(treeSet, 10000);
        long treeSetDeleteEndTime = System.nanoTime();
        long treeSetDeleteTime = treeSetDeleteEndTime - treeSetDeleteStartTime;
        long treeSetDeleteMemoryUsage = measureMemoryUsage(treeSet);

        // Delete Operation for HashMap
        long hashMapDeleteStartTime = System.nanoTime();
        removeElementsByKey(hashMap, 10000);
        long hashMapDeleteEndTime = System.nanoTime();
        long hashMapDeleteTime = hashMapDeleteEndTime - hashMapDeleteStartTime;
        long hashMapDeleteMemoryUsage = measureMemoryUsage(hashMap);

        // Delete Operation for TreeMap
        long treeMapDeleteStartTime = System.nanoTime();
        removeElementsByKey(treeMap, 10000);
        long treeMapDeleteEndTime = System.nanoTime();
        long treeMapDeleteTime = treeMapDeleteEndTime - treeMapDeleteStartTime;
        long treeMapDeleteMemoryUsage = measureMemoryUsage(treeMap);

        // Display results
        System.out.println("ArrayList - Delete Time: " + arrayListDeleteTime + " ns, Memory Usage: " + arrayListDeleteMemoryUsage + " bytes");
        System.out.println("LinkedList - Delete Time: " + linkedListDeleteTime + " ns, Memory Usage: " + linkedListDeleteMemoryUsage + " bytes");
        System.out.println("HashSet - Delete Time: " + hashSetDeleteTime + " ns, Memory Usage: " + hashSetDeleteMemoryUsage + " bytes");
        System.out.println("TreeSet - Delete Time: " + treeSetDeleteTime + " ns, Memory Usage: " + treeSetDeleteMemoryUsage + " bytes");
        System.out.println("HashMap - Delete Time: " + hashMapDeleteTime + " ns, Memory Usage: " + hashMapDeleteMemoryUsage + " bytes");
        System.out.println("TreeMap - Delete Time: " + treeMapDeleteTime + " ns, Memory Usage: " + treeMapDeleteMemoryUsage + " bytes");
    }

    private static void performInsertOperation(ArrayList<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }

    private static void performInsertOperation(LinkedList<Integer> list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }

    private static void performInsertOperation(HashSet<Integer> set) {
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
    }

    private static void performInsertOperation(TreeSet<Integer> set) {
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
    }

    private static void performInsertOperation(HashMap<Integer, Integer> map) {
        for (int i = 0; i < 100000; i++) {
            map.put(i, i);
        }
    }

    private static void performInsertOperation(TreeMap<Integer, Integer> map) {
        for (int i = 0; i < 100000; i++) {
            map.put(i, i);
        }
    }

    private static <T> void removeElementsByValue(ArrayList<T> list, int count) {
        for (int i = 0; i < count; i++) {
            list.remove(0);
        }
    }

    private static <T> void removeElementsByValue(LinkedList<T> list, int count) {
        for (int i = 0; i < count; i++) {
            list.removeFirst();
        }
    }

    private static <T> void removeElementsByValue(TreeSet<T> set, int count) {
        for (int i = 0; i < count; i++) {
            set.remove(i);
        }
    }

    private static <T> void removeElementsByKey(HashSet<T> set, int count) {
        for (int i = 0; i < count; i++) {
            set.remove(i);
        }
    }

    private static <K, V> void removeElementsByKey(HashMap<K, V> map, int count) {
        for (int i = 0; i < count; i++) {
            map.remove(i);
        }
    }

    private static <K, V> void removeElementsByKey(TreeMap<K, V> map, int count) {
        for (int i = 0; i < count; i++) {
            map.remove(i);
        }
    }

    private static long measureMemoryUsage(Object object) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Run garbage collector

        // Calculate memory usage
        long memoryUsage = runtime.totalMemory() - runtime.freeMemory();

        return memoryUsage;
    }
}
