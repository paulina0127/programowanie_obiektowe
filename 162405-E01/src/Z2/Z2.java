package Z2;
import java.util.*;

public class Z2 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> integer = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        printMarginal(integer);
        System.out.println();

        // HashSet
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("kot", "pies", "chomik"));
        printMarginal(hashSet);
        System.out.println();

        // LinkedList
        LinkedList<Character> linkedList = new LinkedList<>(Arrays.asList('a', 'b', 'c'));
        printMarginal(linkedList);
        System.out.println();

        // PriorityQueue
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>(Arrays.asList(5.2, 10.5, 0.5));
        printMarginal(priorityQueue);
    }

    public static <E extends Iterable<?>> void printMarginal(E object) {
        Iterator<?> iterator = object.iterator();
        Object tempF = iterator.next();
        Object tempL = null;

        while (iterator.hasNext())
            tempL = iterator.next();

        System.out.println("Pierwszy: " + tempF + "\nOstatni: " + tempL);
    }
}
