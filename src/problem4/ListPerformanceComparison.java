package problem4;

import java.util.*;
//the analysis of the results is as a comment at the end of the class

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();
        for (int i=0; i<OPERATIONS;i++) {
            int index=random.nextInt(list.size()+1); //choosing random insert position
            list.add(index,i);//adding at that random position
            index=random.nextInt(list.size()); //choose random delete position
            list.remove(index);//delete
        }
        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();

        // Insertions at beginning and end
        for (int i = 0; i < OPERATIONS; i++) {
            list.add(0, i);//in the beginning
            list.add(i);//at theend
        }
        // Deletions at beginning and end
        for (int i = 0; i < OPERATIONS; i++) {
            list.remove(0);// beginning
            list.remove(list.size() - 1); //end
        }

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;
        // sum of the all elements in the list

       // insert your code here
        for (int i = 0; i < OPERATIONS; i++) {
            int index = random.nextInt(list.size());
            sum += list.get(index);
        }
        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

/*
Analysis of the results

Random insertions/deletions:ArrayList performed better,because LinkedList
needs to traverse the array to locate the specified index.

Sequential insertions/deletions at the beginning and end: LinkedList performed
better bc it can insert and remove nodes at both ends in constant time.

Random access:ArrayList was faster bc it supports direct access by index while
LinkedList requires sequential traversal.

*/