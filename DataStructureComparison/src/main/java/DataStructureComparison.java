import java.util.*;

public class DataStructureComparison {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to ArrayList
        long arrayListStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long arrayListEndTime = System.nanoTime();
        long arrayListExecutionTime = arrayListEndTime - arrayListStartTime;
        long arrayListMemoryUsage = getMemoryUsage(arrayList);

        // Adding elements to LinkedList
        long linkedListStartTime = System.nanoTime();
        for (int i = 0; i < 200000; i++) {
            linkedList.add(i);
        }
        long linkedListEndTime = System.nanoTime();
        long linkedListExecutionTime = linkedListEndTime - linkedListStartTime;
        long linkedListMemoryUsage = getMemoryUsage(linkedList);

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long hashSetStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        long hashSetEndTime = System.nanoTime();
        long hashSetExecutionTime = hashSetEndTime - hashSetStartTime;
        long hashSetMemoryUsage = getMemoryUsage(hashSet);

        long treeSetStartTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.add(i);
        }
        long treeSetEndTime = System.nanoTime();
        long treeSetExecutionTime = treeSetEndTime - treeSetStartTime;
        long treeSetMemoryUsage = getMemoryUsage(treeSet);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        long hashMapStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashMap.put(i, i);
        }
        long hashMapEndTime = System.nanoTime();
        long hashMapExecutionTime = hashMapEndTime - hashMapStartTime;
        long hashMapMemoryUsage = getMemoryUsage(hashMap);

        long treeMapStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            treeMap.put(i, i);
        }
        long treeMapEndTime = System.nanoTime();
        long treeMapExecutionTime = treeMapEndTime - treeMapStartTime;
        long treeMapMemoryUsage = getMemoryUsage(treeMap);

        // Display results
        System.out.println("ArrayList - Insert Time: " + arrayListExecutionTime + " ns, Memory Usage: " + arrayListMemoryUsage + " bytes");
        System.out.println("LinkedList - Insert Time: " + linkedListExecutionTime + " ns, Memory Usage: " + linkedListMemoryUsage + " bytes");
        System.out.println("HashSet - Insert Time: " + hashSetExecutionTime + " ns, Memory Usage: " + hashSetMemoryUsage + " bytes");
        System.out.println("TreeSet - Insert Time: " + treeSetExecutionTime + " ns, Memory Usage: " + treeSetMemoryUsage + " bytes");
        System.out.println("HashMap - Insert Time: " + hashMapExecutionTime + " ns, Memory Usage: " + hashMapMemoryUsage + " bytes");
        System.out.println("TreeMap - Insert Time: " + treeMapExecutionTime + " ns, Memory Usage: " + treeMapMemoryUsage + " bytes");
    }

    private static long getMemoryUsage(Object object) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
        Object[] array = {object};
        runtime.gc();
        long memoryUsage = runtime.totalMemory() - runtime.freeMemory() - initialMemory;
        return memoryUsage;
    }
}
